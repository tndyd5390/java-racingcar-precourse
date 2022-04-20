package racingcar.service;

import racingcar.code.ErrorCode;
import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingService {

    public Cars generateCarsFromUser() {
        try {
            String carNames = InputView.inputCarNames();
            Cars cars = Cars.from(carNames);
            return cars;
        } catch (Exception e) {
            OutputView.printError(e.getMessage());
            return generateCarsFromUser();
        }
    }

    public int getGameRounds() {
        try {
            return Integer.parseInt(InputView.inputGameRounds());
        } catch (NumberFormatException e) {
            OutputView.printError(ErrorCode.IS_NOT_NUMBERIC.getErrorMessage());
            return getGameRounds();
        }
    }

}
