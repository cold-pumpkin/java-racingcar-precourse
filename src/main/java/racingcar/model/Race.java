package racingcar.model;

import static racingcar.view.ResultMessageView.printRaceProgressStatus;
import static racingcar.view.ResultMessageView.printResultStartMessage;

public class Race {
    private final Cars cars;
    private final Round round;

    public Race(Cars cars, Round round) {
        this.cars = cars;
        this.round = round;
    }

    public void start() {
        printResultStartMessage();
        for (int i = 0; i < round.getTryTime(); i++) {
            cars.move();
            printRaceProgressStatus(cars);
        }
    }
}
