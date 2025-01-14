package racingcar

import camp.nextstep.edu.missionutils.Randoms

class Racing() {

    //true 면 move, false면 stop
    fun determineMoveOrStop(randomNumber: Int) = randomNumber >= BASE_NUMBER

    private fun makeRandomNumber() = Randoms.pickNumberInRange(0, 9)

    fun getRacingDistances(numberAttempts: Int,cars: List<Car>) {
        repeat(numberAttempts) { runRaceOnce(cars) }
        printWinner(getWinner(cars))
    }

    private fun runRaceOnce(cars: List<Car>){
        cars.forEach { car ->
            val randomNumber = makeRandomNumber()
            if (determineMoveOrStop(randomNumber)) car.distance++
        }
        printMatchProgress(cars)
    }

    fun printMatchProgress(cars: List<Car>) {
        cars.forEach { car -> println("${car.name} : ${"-".repeat(car.distance)}") }
        println()
    }

    fun getWinner(cars:List<Car>): String {
        val maxDistance = cars.maxOfOrNull { it.distance }
        val winners = cars.filter { it.distance == maxDistance }
        return winners.joinToString { it.name }
    }

    fun printWinner(winnerNames:String){
        println("최종 우승자 : $winnerNames")
    }
}