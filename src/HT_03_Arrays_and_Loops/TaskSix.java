package HT_03_Arrays_and_Loops;

import java.util.Random;

public class TaskSix {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(5);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i==j){
                    array[i][j]=0;
                }
                if(i<j){
                    array[i][j]=-1;
                }
                if(i>j){
                    array[i][j]=1;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
