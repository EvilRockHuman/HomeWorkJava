package Task14;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        Set<Integer> strings = new TreeSet<>();
        strings.add(1);
        strings.add(12);
        strings.add(11);
        strings.add(10);
        strings.add(9);
        strings.add(8);
        strings.add(7);
        strings.add(6);
        strings.add(5);
        strings.add(4);
        strings.add(3);
        strings.add(2);
        strings.add(15);
        strings.add(14);
        strings.add(16);
        strings.add(17);
        strings.add(18);
        strings.add(19);
        strings.add(20);
        strings.add(21);
        Iterator<Integer> iterator = strings.iterator();
       while (iterator.hasNext()){
            if(iterator.next()>10){
               iterator.remove();
            }
        }
        System.out.println(strings);
    }
}
