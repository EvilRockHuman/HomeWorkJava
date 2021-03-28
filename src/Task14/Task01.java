package Task14;

import java.util.HashSet;
import java.util.Set;

public class Task01 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            strings.add("Lora"+i);
        }
        System.out.println(strings);

    }
}
