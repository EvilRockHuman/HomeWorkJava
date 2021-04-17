package Streams;

import java.io.*;
import java.util.Scanner;

public class test {
    private static Reader fileReader;
    private static final String FILE_PATH = "C:\\Users\\User\\IdeaProjects\\HomeWorkJava\\src\\Streams\\gg.txt";
    private static File file;
    private static final String FILE_CATALOG = "C:\\Users\\User\\IdeaProjects\\HomeWorkJava\\src\\Streams\\%s";
    private static Writer fileWriter;
    private static Scanner scanner;
    public static void main(String[] args) {
        System.out.println(createNewFile(readName(), readContent()));
    }
    public static String readName() {
        String name = "";
        try {
            fileReader = new FileReader(FILE_PATH);
            scanner = new Scanner(fileReader);
            name = scanner.nextLine();
            name = name.substring(10);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (fileReader != null)
            try {
                fileReader.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        scanner.close();
        return name;
    }
    private static String readContent() {
        String content = "";
        try {
            fileReader = new FileReader(FILE_PATH);
            scanner = new Scanner(fileReader);
            content = scanner.nextLine();
            content = scanner.nextLine();
            content = content.substring(9);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (fileReader != null) {
            try {
                fileReader.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        scanner.close();
        return content;
    }
    private static boolean createNewFile(String nameFile, String content) {
        boolean succefully = false;
        try {
            file = new File(String.format(FILE_CATALOG, nameFile));
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file, false);
            fileWriter.write(content);
            fileWriter.flush();
            succefully = true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (fileWriter != null) {
            try {
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return succefully;
    }
}
