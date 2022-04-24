package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Cars;
import racingcar.model.input.CarName;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static racingcar.view.ResultMessageView.printRaceProgressStatus;
import static racingcar.view.ResultMessageView.printResultStartMessage;

class ResultMessageViewTest extends MessageViewTest {

    @Test
    @DisplayName("레이스 실행 결과 안내 시작 메시지가 정상적으로 출력되는지 확인한다.")
    void printResultStartMessageTest() {
        printResultStartMessage();

        assertThat(output())
                .isEqualTo("실행 결과");
    }

    @Test
    @DisplayName("레이스 실행 결과 안내 메시지가 정상적으로 출력되는지 확인한다.")
    void printRaceFirstProgressStatusTest() {
        List<CarName> carNames = Arrays.asList(
                new CarName("park"), new CarName("kim"), new CarName("lee")
        );
        Cars cars = new Cars(carNames);
        printRaceProgressStatus(cars);

        assertThat(output())
                .contains("park :")
                .contains("kim :")
                .contains("lee :");
    }


}