# 기능 목록

### 입력

- 경주할 자동차 이름을 입력하는 기능
- 몇 번의 이동을 할 지 입력하는 기능

### 출력

- `“경주할 자동차 이름을 입력하세요."`를 출력하는 기능
- `“시도할 횟수는 몇 회인가요?”`를 출력하는 기능
- `“최종 우승자 : "`를 출력하는 기능
- 각 차수별 실행 결과를 출력하는 기능

### 경주

- 무작위 수를 생성하는 기능
- 자동차가 전진하는지 정지하는지 판단하는 기능 (무작위 수가 4 이상, 미만)
- 우승자를 판별하는 기능
- 각 자동차마다 움직인 거리 저장 기능

### 검사 및 예외처리

- 자동차 이름이 올바른 값인 지  검사하는 기능
    - 올바른값: Null X, 5자리 이하, 중복 X
- 사용자가 몇 번 이동할 지 입력 할 때 숫자를 올바른 값을 입력하는 지 검사하는 기능
    - 올바른값: Null X, 0이 아닌 정수
- 사용자 입력 값에 대해 올바르지 않을 경우 `IllegalArgumentException` 를 발생시키는 기능
