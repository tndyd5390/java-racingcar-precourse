package racingcar.exception;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.code.ErrorCode;

class RacingExceptionTest {
    
    @DisplayName("레이싱 게임 예외 처리시 [ERROR]로 시작하는지 확인하는 테스트")
    @Test
    void racingExceptionStartWith() {

        //given //when //then
        assertThatThrownBy(() -> {
            throw new RacingException(ErrorCode.CAR_NAVE_OVER_MAX_LENGTH);
        }).hasMessageStartingWith("[ERROR]");

    }

}
