package TaskSix;

public class Task03 {
    public static void main(String args[]) {

        array();
    }
    static void array(){
        int result = 0;
        String[] massive = {"mother", "brother", "look", "picture", "cook", "soup"};
        for (int i = 0; i < massive.length; i+=2) {
            result = massive[i].compareTo(massive[i+1]);
            if(result>0){
                System.out.println(massive[i+1]);
            } else {
                System.out.println(massive[i]);
            }
        }
    }


}
