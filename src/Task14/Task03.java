package Task14;


import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        Map<String, String> waitMe = new LinkedHashMap<>();
        waitMe.put("Lara", "Petrov");
        waitMe.put("Sergey", "Petrov");
        waitMe.put("Maxim", "Baba");
        waitMe.put("Petr", "Petrov");
        waitMe.put("Mark", "Shewcov");
        waitMe.put("Mir", "Mala");
        waitMe.put("Sara", "Buba");
        waitMe.put("Mur", "Mnogo");
        waitMe.put("Tur", "Mala");
        waitMe.put("Bar", "Buba");
        Iterator<String> iterator = waitMe.keySet().iterator();
        Set<String> strings = waitMe.keySet();
        for(String k : waitMe.values()){
            System.out.println(k);
            if(k=="Petrov"){
                waitMe.remove(k);

            }
        }
        System.out.println(waitMe);
    }
}
