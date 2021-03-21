package HT_03_Arrays_and_Loops;

import java.util.Arrays;
import java.util.Random;

public class TaskSeven {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            int x = array[i];
        }

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;

                }
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]==array[i+1]){
                int x = array[i];
                int index = i;
                System.out.println(index);
                System.out.println(x);
                if(array[index]==x){
                }


            }
        }
        System.out.println(Arrays.toString(array));
    }
}
