package racingcar.code;

public enum CarValueRange {
    MIN_NUMBER_RANGE(0),
    MAX_NUMBER_RANGE(9),
    CAR_MOVING_VALUE(4);

    private int carValueRange;

    CarValueRange(int carValueRange) {
        this.carValueRange = carValueRange;
    }

    public int getCarValueRange() {
        return this.carValueRange;
    }
}
