package racingcar.model.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNamesTest {

    @Test
    @DisplayName("자동차가 1대 미만인 경우 IllegalArgumentException를 발생시킨다.")
    void validateCarNamesMinSizeTest() {
        assertThatThrownBy(() -> {
            new CarNames(Collections.emptyList());
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 1대 이상의 자동차를 입력해주세요!");
    }

    @Test
    @DisplayName("자동차가 7대가 넘인 경우 IllegalArgumentException를 발생시킨다.")
    void validateCarNamesMaxSizeTest() {
        List<String> names = Arrays.asList("kim", "choi", "park", "lee", "han", "sin", "ho", "joo");
        assertThatThrownBy(() -> {
            new CarNames(names);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 7대 이하의 자동차를 입력해주세요!");
    }

    @Test
    @DisplayName("자동차 이름에 중복이 존재하는 경우IllegalArgumentException를 발생시킨다.")
    void validateCarNamesNotUniqueTest() {
        List<String> names = Arrays.asList("kim", "choi", "park", "kim");
        assertThatThrownBy(() -> {
            new CarNames(names);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 중복된 자동차 이름이 존재합니다!");
    }
}