package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

public class ResultMessageView {
    private static final String RESULT_START_MESSAGE = "실행 결과";
    private static final String PROGRESS_BAR = "-";

    public static void printResultStartMessage() {
        System.out.println(RESULT_START_MESSAGE);
    }

    public static void printRaceProgressStatus(Cars cars) {
        cars.getCars().forEach(ResultMessageView::printCarPosition);
        System.out.println();
    }

    private static void printCarPosition(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(PROGRESS_BAR);
        }
        System.out.println();
    }
}
