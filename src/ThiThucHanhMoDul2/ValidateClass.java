package ThiThucHanhMoDul2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static Pattern pattern;
    private Matcher matcher;
    public ValidateClass(){}
    public static boolean validate(String regex, String string) {
        Pattern pattern = Pattern.compile(regex);
        Matcher  matcher = pattern.matcher(string);
        return matcher.matches();
    }
    public static final String name_REGEX = "[A-Za-z ]+";
    private static final String number_REGEX = "[0-9]+";
}
