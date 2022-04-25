package racingcar.controller;

import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.model.Round;
import racingcar.model.input.CarNames;

import static racingcar.model.GameInputReader.*;

public class GameController {

    public void play() {
        Cars cars = getCarsFromUserInput();
        Round round = getRoundFromUserInput();

        Race race = new Race(cars, round);
        race.start();
        race.finish();
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

    private Round getRoundFromUserInput() {
        while (true) {
            try {
                return new Round(readRacingRounds());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
