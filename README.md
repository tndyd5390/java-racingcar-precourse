# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록

### 자동차

- [x] n대의 자동차를 생성할 수 있다.
- [x] 자동차의 이름은 입력값 기준으로 쉼표로 구분하며 5자를 넘을 수 없다.
- [x] 자동차는 전진 또는 정지 할 수 있다. 전진 또는 정지는 랜덤값을 기준으로 한다.
    - 랜덤값이 0 ~ 3 일경우 정지
    - 랜덤 값이 4 ~ 9 일경우 전진

### 게임 진행

- [x] 자동차의 이름을 쉼표로 구분하여 입력 받는다.
- [x] 시도할 횟수를 입력 받는다.
- [x] 각 라운드를 진행한다.
- [x] 게임이 종료되면 촤종 우승자를 출력한다.
    - 공동우승일 경우 쉼표로 구분하여 출력한다.

### 예외 처리

- [x] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시키고, "[ERROR]"로 시작하는 메세지를 출력한다.
    - 명확한 Exception을 처리한다.
- [x] 사용자가 잘못된 값을 입력할 경우 그 부분부터 입력을 다시 받는다.

