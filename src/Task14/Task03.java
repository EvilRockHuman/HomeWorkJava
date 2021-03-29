package Task14;


import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        Map<String, String> waitMe = new LinkedHashMap<>();
        waitMe.put("Lorein", "Petrov");
        waitMe.put("Sergey", "Petrov");
        waitMe.put("Maxim", "Baba");
        waitMe.put("Petr", "Petrov");
        waitMe.put("Mark", "Shewcov");
        waitMe.put("Mir", "Mala");
        waitMe.put("Lara", "Buba");
        waitMe.put("Mur", "Mnogo");
        waitMe.put("Tur", "Mala");
        waitMe.put("Bar", "Buba");
        int j = 0;
        Iterator<String> iterator = waitMe.values().iterator();
        for (int i = 0; i < waitMe.size(); i++) {
            if (iterator.next() == "Petrov") {
                j += 1;
            }
        }
        System.out.print("Совпадений найдено по данной записи: ");
        System.out.println(j);
    }
}
