package HT_03_Arrays_and_Loops;

import java.util.Arrays;
import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if(array[i]%2==0){
                array[i]=0;
            } else{
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
