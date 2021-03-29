package Task14;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task05 {
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
        Iterator<String> iterator = waitMe.values().iterator();
        for (int i = 0; i < waitMe.size()-1; i++) {
                if(iterator.next()==iterator.next());
                 waitMe.remove(i);
            }

        }

    }

