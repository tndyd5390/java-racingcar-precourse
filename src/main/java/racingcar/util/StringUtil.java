package racingcar.util;

public class StringUtil {
    private final static String COMMA = ",";

    public static String[] splitByComma(String input) {
        return input.split(COMMA);
    }
}
