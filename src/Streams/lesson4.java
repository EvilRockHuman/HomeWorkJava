package Streams;

import java.io.*;

public class lesson4 extends Account implements Serializable {
    FileOutputStream fos;
    ObjectOutputStream oos;
    {
        try {
            fos = new FileOutputStream("C:\\Users\\User\\IdeaProjects\\HomeWorkJava\\src\\Streams\\file\\lesson4.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(username);
            oos.writeObject(email);
            oos.writeObject(password);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
