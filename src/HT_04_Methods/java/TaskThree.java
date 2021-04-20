package HT_04_Methods.java;

public class TaskThree {
    public static void main(String[] args) {
        cross(12);
    }
    static void cross(int number){
        int j = 2;
        int result = 0;
        while (j <= number / 2)
        {
            if (number % j == 0)
            {
                result = 1;
            }
            j++;
        }
        if (result == 1)
        {
            System.out.println("Number: " + number + " is Not Prime.");
        }
        else
        {
            System.out.println("Number: " + number + " is Prime. ");
        }
    }
}
