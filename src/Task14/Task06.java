package Task14;

import java.util.Iterator;
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
        Iterator<Integer> iterator = nameAndHappyDays.keySet().iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next.hashCode()<500){
                iterator.remove();
            }
        }
        System.out.println(nameAndHappyDays);
    }
}