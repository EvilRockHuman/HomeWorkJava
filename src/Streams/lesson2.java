package Streams;

import java.io.*;
import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        newFile(lineOne(), lineTwo());
    }

    private static String lineOne() {
        String name = "";
        try (FileInputStream fis = new FileInputStream("C:\\Users\\User\\IdeaProjects\\HomeWorkJava\\src\\Streams\\file\\gg.txt")) {
            Scanner scanner = new Scanner(fis);
            name = scanner.nextLine();
            name = name.substring(10);
        } catch (Exception e) {
            System.err.println(false);
        }
        return name;
    }

    private static String lineTwo() {
        String name = "";
        try (FileInputStream fis = new FileInputStream("C:\\Users\\User\\IdeaProjects\\HomeWorkJava\\src\\Streams\\file\\gg.txt")) {
            Scanner scanner = new Scanner(fis);
            name = scanner.nextLine();
            name = scanner.nextLine();
            name = name.substring(9);
        } catch (Exception e) {
            System.err.println(false);
        }
        return name;
    }

    private static boolean newFile(String name, String text) {
        boolean finish = false;
        try (FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\User\\\\IdeaProjects\\\\HomeWorkJava\\\\src\\\\Streams\\\\file\\" + name)) {
            byte[] bytes = lineTwo().getBytes();
            fos.write(bytes, 0, bytes.length);
            System.out.println(finish = true);
        } catch (Exception e) {
            System.out.println(false);
        }
        return finish;
    }
}