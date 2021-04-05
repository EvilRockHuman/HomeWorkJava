package Task14;

import java.util.*;

public class Task05 {
    public static void main(String[] args) {
        Map<String, String> waitMe = new LinkedHashMap<>();
        waitMe.put("Lorein", "Petrov");
        waitMe.put("Sergey", "Petrov1");
        waitMe.put("Maxim", "Baba");
        waitMe.put("Petr", "Petrov");
        waitMe.put("Mark", "Shewcov");
        waitMe.put("Mir", "Mala");
        waitMe.put("Lara", "Buba");
        waitMe.put("Mur", "Mnogo");
        waitMe.put("Tur", "Mala");
        waitMe.put("Bar", "Buba");
        System.out.println(waitMe);
        Map<String, String> map2 = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : waitMe.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());
        }

        Map<String, String> map3 = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            map3.put(entry.getValue(), entry.getKey());
        }
        System.out.println(map3);
    }
}



