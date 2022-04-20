package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("자동차 단위 테스트")
class CarTest {
    @DisplayName("자동차 인스턴스 생성 테스트")
    @Test
    void newCarTest() {

        //given //when
        Car car = new Car("name");

        //then
        assertThat(car).isInstanceOf(Car.class);
    }

    @DisplayName("자동차 인스턴스 위치 초기값 테스트")
    @Test
    void getPositionTest() {

        //given
        Car car = new Car("name");

        //when
        int position = car.getPosition();

        //then
        assertThat(position).isZero();
    }

    @DisplayName("자동차 이름 가져오기 테스트")
    @Test
    void getCarNameTest() {

        //given
        String name = "name";
        Car car = new Car("name");

        //when
        String result = car.getCarName();

        //then
        assertThat(result).isEqualTo(name);
    }

    @DisplayName("앞으로 한칸 이동 테스트")
    @Test
    void moveForwardTest() {

        //given
        Car car = new Car("name");

        //when
        car.moveForward();

        //then
        assertThat(car.getPosition()).isEqualTo(1);
    }

}
