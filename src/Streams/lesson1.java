package Streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class lesson1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mark");
        list.add("Mark1");
        list.add("Mark2");
        list.add("Mark3");
        listSave(list,"lesson1");
    }

    private static void listSave(List<String> list, String fileName) {
        try (OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\HomeWorkJava\\src\\Streams\\file\\"+fileName))) {
            for (String strings : list) {
                out.write(strings);
            }
            System.out.println(true);
        } catch (Exception e) {
            System.err.println(false);
        }
    }
}
