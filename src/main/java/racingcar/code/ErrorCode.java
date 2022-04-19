package racingcar.code;

public enum ErrorCode {
    CAR_NAVE_OVER_MAX_LENGTH("이름의 길이가 5보다 큽니다."),
    CAR_NAME_NULL("차의 이름이 null 입니다."),
    CAR_NAME_IS_EMPTY("차의 이름이 공백입니다.");
    
    private String errorMessage;

    ErrorCode(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
