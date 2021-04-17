package Streams;

import java.io.*;
import java.util.*;

public class lesson3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rara3");
        list.add("rara1");
        list.add("rara2");
        Map<String, List<String>> map = new HashMap<>();
        map.put("Masha",list);

    }
    private  static void tufta(Map<String, List<String>> map){
        map.get("FakeFile");
    }
}