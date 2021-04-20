package Task10;

public class Employee {
    String name;
    String address;
    int experience;
    public Employee(String name, String address, int experience){
        this.address = address;
        this.name = name;
        this.experience = experience;
    }
    static String  getName(String name){
        return name;
    }
    static String getEmail(String address){
        return address;
    }
    static int getExperience(int experience){
        return experience;
    }

}
