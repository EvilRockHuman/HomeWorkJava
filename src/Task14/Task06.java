package Task14;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task06 {
    public static void main(String[] args) {
        Map<Integer, String> nameAndHappyDays = new LinkedHashMap<>();
        nameAndHappyDays.put(499, "Vavilov");
        nameAndHappyDays.put(500, "Mironov");
        nameAndHappyDays.put(501, "Samoilov");
        nameAndHappyDays.put(600, "Zmitrovich");
        nameAndHappyDays.put(390, "Durakov");
        nameAndHappyDays.put(245, "Indorob");

        for (Integer i: nameAndHappyDays.keySet()) {
            if (i>500) {
                nameAndHappyDays.remove(nameAndHappyDays.get(i));
            }
        }
        System.out.println(nameAndHappyDays);
    }
}