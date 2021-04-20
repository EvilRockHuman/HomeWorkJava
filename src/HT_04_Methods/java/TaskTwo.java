package HT_04_Methods.java;

public class TaskTwo {
    public static void main(String[] args) {
        chart(3);
        System.out.println();
        chart(4);
        System.out.println();
        chart(2);
    }
    static void chart(int x) {
        for (int j = x; j <= x && j>=0; j--) {
            for (int i = x; i > j; i--) {
                System.out.print(x - j  +" ");
            }
        }
    }
}
