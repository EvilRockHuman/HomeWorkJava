package Streams;

import java.io.FileInputStream;
import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        String str = "lesson5.txt";
        System.out.println(name(str));
    }

    private static String name(String nameFile) {
        String nameFileReader = "";
            try (FileInputStream fis = new FileInputStream("C:\\\\Users\\\\User\\\\IdeaProjects\\\\HomeWorkJava\\\\src\\\\Streams\\\\file\\"+nameFile)) {
                Scanner scanner = new Scanner(fis);
                nameFileReader = scanner.nextLine();
            } catch (Exception e) {
                System.err.println(false);
            }
            return nameFileReader;
    }
}
