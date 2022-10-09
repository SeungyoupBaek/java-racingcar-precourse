package racingcar.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    @DisplayName("입력값_0부터_9사이_검증")
    void 입력값_0부터_9사이_검증() {
        assertThat(ValidationUtils.validNo(9)).isTrue();
        assertThat(ValidationUtils.validNo(0)).isTrue();
        assertThat(ValidationUtils.validNo(-1)).isFalse();
        assertThat(ValidationUtils.validNo(10)).isFalse();
    }

    @Test
    @DisplayName("이름의_길이가_5자이하_검증")
    void 이름의_길이가_5자이하_검증() {
        assertThat(ValidationUtils.validName("abc")).isTrue();
        assertThat(ValidationUtils.validName("abcde")).isTrue();
        assertThat(ValidationUtils.validName("abcdef")).isFalse();
        assertThat(ValidationUtils.validName("")).isFalse();
    }
}
