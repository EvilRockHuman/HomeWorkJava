package Task10;

public class DataAnalyst extends Employee{
    boolean phd;
    String[] methods;
    public DataAnalyst(String name, String address, int experience, boolean phd, String[] methods) {
        super(name, address, experience);
        this.phd = phd;
        this.methods = methods;
    }


    static String isPhD (String phd){
        return phd;
    }
    static String getMethods (String methods){
        return methods;
    }

}
