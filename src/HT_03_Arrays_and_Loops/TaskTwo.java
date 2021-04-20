package HT_03_Arrays_and_Loops;

import java.util.Arrays;
import java.util.Random;

public class TaskTwo {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("");
        for (int i = 0; i < (array.length / 2) - 1; i++) {
            for (int j = 0; j < (array.length / 2) - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
                if (array[i] < array[i + 1]) {
                    int value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }

            }

            System.out.println(Arrays.toString(array));
        }
        System.out.println();
        System.out.println("");
        for (int i = 5; i < array.length - 1; i++) {
            for (int j = 5; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
                if (array[i] > array[i + 1]) {
                    int value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }

            }
            System.out.println(Arrays.toString(array));
        }
    }
}
