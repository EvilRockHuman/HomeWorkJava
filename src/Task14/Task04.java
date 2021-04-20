package Task14;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task04 {
    public static void main(String[] args) {
        Map<String, String> nameAndHappyDays = new LinkedHashMap<>();
        nameAndHappyDays.put("august", "Vavilov");
        nameAndHappyDays.put("september", "Mironov");
        nameAndHappyDays.put("october", "Samoilov");
        nameAndHappyDays.put("november", "Zmitrovich");
        nameAndHappyDays.put("Jule", "Durakov");
        nameAndHappyDays.put("June", "Indorob");
        nameAndHappyDays.remove("Jule");
        nameAndHappyDays.remove("June");
        nameAndHappyDays.remove("august");
        System.out.println(nameAndHappyDays);
    }
}

