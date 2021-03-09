package TaskSix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        java.lang.String text = "mail@mail.com, 2mail@mail.com, mail@mail..com, mail@@mail.com,mail@mail.mail.com, mail@mail@mail.com, @mail.com, mail.com,mail@mail, mail@.com";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+\\@{1}[a-zA-Z0-9]+\\.[com]{3}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
