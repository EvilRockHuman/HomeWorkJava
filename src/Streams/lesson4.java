package Streams;

import java.io.*;

public class lesson4 extends Account implements Serializable {
    FileOutputStream fos;
    ObjectOutputStream oos;
    {
        try {
            fos = new FileOutputStream("C:\\Users\\User\\IdeaProjects\\HomeWorkJava\\src\\Streams\\file\\lesson4.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(getUsername());
            oos.writeObject(getEmail());
            oos.writeObject(getPassword());
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public lesson4(String username, String email) {
        super(username, email);
    }
}
