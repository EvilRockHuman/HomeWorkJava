package Task14;


import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> set = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            set.add(i);
        }
        System.out.println(set);


        List<Integer> set2 = new ArrayList<>();
        for (int i = 0; i < set.size() - 1; i += 2) {
            int sum = set.get(i) + set.get(i + 1);
            set2.add(sum);
            System.out.println(sum);
        }
        System.out.println(set2);


        List<Integer> set3 = new ArrayList<>();
        for (int i = 0; i < set2.size() - 1; i += 2) {
            int sum = set2.get(i) + set2.get(i + 1);
            set3.add(sum);
            System.out.println(sum);
        }
        System.out.println(set3);


        List<Integer> set4 = new ArrayList<>();
        for (int i = 0; i < set3.size() - 1; i += 2) {
            int sum = set3.get(i) + set3.get(i + 1);
            set4.add(sum);
            System.out.println(sum);
        }
        System.out.println(set4);
    }
}

