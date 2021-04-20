package Task13;

public class Movie {
    public String title;
    public String desc;
    public int year;
    public Movie(String title, String desc, int year){
        this.desc = desc;
        this.title = title;
        this.year = year;
    }
    public Movie(String title, int year){
        this.title = title;
        this.year = year;
    }
}
