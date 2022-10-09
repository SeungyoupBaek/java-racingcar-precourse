package racingcar.util;

public class ValidationUtils {
    public static final int MIN_no = 0;
    public static final int MAX_NO = 9;
    public static final int MIN_NAME_LENGTH = 0;
    public static final int MAX_NAME_LENGTH = 5;

    public static boolean validNo(int no) {
        return no >= MIN_no && no <= MAX_NO;
    }

    public static boolean validName(String name) {
        return name.length() > MIN_NAME_LENGTH && name.length() <= MAX_NAME_LENGTH;
    }
}
