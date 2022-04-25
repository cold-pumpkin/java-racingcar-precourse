package racingcar.controller;

import racingcar.model.Cars;
import racingcar.model.input.CarNames;

import static racingcar.model.GameInputReader.*;

public class GameController {

    public GameController() {
    }

    public void play() {
        Cars cars = getCarsFromUserInput();
    }

    private Cars getCarsFromUserInput() {
        while (true) {
            try {
                CarNames carNames = new CarNames(readRacingCarNames());
                return new Cars(carNames.getCarNames());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
