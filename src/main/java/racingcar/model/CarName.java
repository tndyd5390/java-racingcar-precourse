package racingcar.model;

import java.util.Objects;
import racingcar.code.ErrorCode;
import racingcar.exception.RacingException;

public class CarName {
    private final int MAX_CAR_NAME_LENGTH = 5;
    private final String carName;

    public CarName(final String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

    private void validateCarName(String carName) {
        if (isNull(carName)) {
            throw new RacingException(ErrorCode.CAR_NAME_NULL);
        }
        if (isLongerThanFive(carName)) {
            throw new RacingException(ErrorCode.CAR_NAVE_OVER_MAX_LENGTH);
        }
        if (isEmpty(carName)) {
            throw new RacingException(ErrorCode.CAR_NAME_IS_EMPTY);
        }
    }

    private boolean isLongerThanFive(String carName) {
        return carName.length() > MAX_CAR_NAME_LENGTH;
    }

    private boolean isNull(String carName) {
        return Objects.isNull(carName);
    }

    private boolean isEmpty(String carName) {
        return carName.isEmpty();
    }
}
