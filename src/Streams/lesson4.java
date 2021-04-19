package Streams;

import java.io.*;

public class lesson4 implements Serializable {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Матвей СНиИ\\Desktop\\идеа\\HomeWorkJava\\src\\Streams\\lesson4.txt");
        Account account = new Account("Simkora","job_it@gmail.com","12345678");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            out.writeObject(account);
            out.flush();
            Account account1 = (Account) ois.readObject();
            System.out.println(account1);
        } catch (IOException | ClassNotFoundException e){
            System.err.println(false);
        }
    }
}
