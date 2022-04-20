package racingcar.model;

public class Car {
    private static final int INITAL_CAR_POSITION = 0;
    private CarName carName;
    private int position = INITAL_CAR_POSITION;

    public Car(String carName) {
        this.carName = new CarName(carName);
    }

    public String getCarName() {
        return this.carName.getCarName();
    }

    public int getPosition() {
        return this.position;
    }

    public void moveForward() {
        this.position++;
    }
}
