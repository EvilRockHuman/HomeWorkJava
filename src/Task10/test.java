package Task10;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[] skills = {"git", "Scala", "JBoss", "UML"};
        Developer developer = new Developer("Mary","mary@gmail.com", 3, "Java", skills);

        String[] m1Methods = {"neural networks", "decision tree", "bayesian algorithms"};
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, m1Methods);

    }
}
