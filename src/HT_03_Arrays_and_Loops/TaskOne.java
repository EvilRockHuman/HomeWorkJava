package HT_03_Arrays_and_Loops;

import java.util.Arrays;
import java.util.Random;

public class TaskOne {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            array[5]=0;
        }
        System.out.println(Arrays.toString(array));
    }
}
