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
        waitMe.put("Lara", "Buba");
        waitMe.put("Mur", "Mnogo");
        waitMe.put("Tur", "Mala");
        waitMe.put("Bar", "Buba");
        int j = 1;
        Iterator<String> iterator = waitMe.values().iterator();
        for (int i = 0; i < waitMe.size(); i++) {
            if(iterator.next()=="Buba"){
                j+=1;
                System.out.println("1");
            }

        }
        System.out.println(j);





        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("Lara")){
                iterator.remove();
            }
        }
        System.out.println(waitMe);
    }
}
