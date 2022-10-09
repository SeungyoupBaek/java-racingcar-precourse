package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
// 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우 전진하고, 3이하의 값이면 멈춘다.
public class RacingCarTest {
    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = RacingCar.getFromName("Seungyoup");
    }

    @Test
    void 자동차_전진() {
        racingCar.move(5);
        assertThat(racingCar.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_정지() {
        racingCar.move(3);
        assertThat(racingCar.getPosition()).isEqualTo(0);
    }

    @Test
    void 자동차_전진_정지() {
        racingCar.move(5);
        assertThat(racingCar.getPosition()).isEqualTo(1);
        racingCar.move(3);
        assertThat(racingCar.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_입력범위_벗어난_값_입력시() {
        assertThatIllegalArgumentException().isThrownBy(() -> racingCar.move(-1));
        assertThatIllegalArgumentException().isThrownBy(() -> racingCar.move(10));
    }
}
