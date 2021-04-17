package Streams;

import java.io.*;
import java.util.*;

public class lesson3 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("rara3");
        list1.add("rara1");
        list1.add("rara2");
        map.put("file1",list1);
        List<String> list2 = new ArrayList<>();
        list2.add("rara33");
        list2.add("rara11");
        list2.add("rara22");
        map.put("file2",list2);
        List<String> list3 = new ArrayList<>();
        list3.add("rara333");
        list3.add("rara111");
        list3.add("rara222");
        map.put("file3",list3);

        tufta(map);
    }
    private  static void tufta(Map<String, List<String>> map){
        for (Map.Entry<String,List<String>> maps: map.entrySet()) {
            String fileName = maps.getKey();
            List<String> text = maps.getValue();
            try{
                File file = new File("C:\\Users\\User\\IdeaProjects\\HomeWorkJava\\src\\Streams\\file\\"+fileName);
                Writer writer = new FileWriter(file,false);
                for (String tmp: text) {
                    writer.write(tmp+"\n");
                }
                writer.flush();
                System.out.println(true);
            } catch (Exception e ){
                System.err.println(false);
            }

        }

    }
}