package racingcar.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("자동차 일급객체 단위 테스트")
class CarsTest {

    @DisplayName("인스턴스 생성 테스트")
    @Test
    void fromTest() {

        //given //when
        Cars cars = Cars.from("name1,name2,name3");

        //then
        assertThat(cars).isInstanceOf(Cars.class);
    }
    
}
