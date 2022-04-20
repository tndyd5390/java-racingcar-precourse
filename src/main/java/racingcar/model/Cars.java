package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.util.StringUtil;

public class Cars {
    List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars from(String carNames) {
        return new Cars(attendCar(carNames));
    }

    private static List<Car> attendCar(String carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : StringUtil.splitByComma(carNames)) {
            cars.add(new Car(carName));
        }
        return cars;
    }
}
