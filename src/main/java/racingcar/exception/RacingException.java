package racingcar.exception;

import racingcar.code.ErrorCode;

public class RacingException extends RuntimeException {
    private static String ERROR = "[ERROR]";

    public RacingException(ErrorCode errorCode) {
        super(ERROR + errorCode.getErrorMessage());
    }
}
