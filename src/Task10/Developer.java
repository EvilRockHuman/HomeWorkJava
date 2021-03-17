package Task10;

public class Developer extends Employee{
    String mainLanguage;
    String[] skills;
    public Developer(String name, String address, int experience,String mainLanguage, String[] skills) {
        super(name, address, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }
    static String getMainLanguage (String mainLanguage){
        return mainLanguage;
    }
    static String getSkills(String skills){
        return skills;
    }

}
