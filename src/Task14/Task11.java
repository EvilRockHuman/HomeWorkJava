package Task14;

import java.util.ArrayList;
import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        String text = "Meet my family. There are five of us – my parents, " +
                "my elder brother, my baby sister and me. First, meet my mum " +
                "and dad, Jane and Michael. My mum enjoys reading and my dad " +
                "enjoys playing chess with my brother Ken. My mum is slim and " +
                "rather tall. She has long red hair and big brown eyes. She " +
                "has a very pleasant smile and a soft voice. My mother is very" +
                " kind and understanding. We are real friends. She is a housewife." +
                " As she has three children, she is always busy around the house." +
                " She takes care of my baby sister Meg, who is only three months old." +
                " My sister is very small and funny. She sleeps, eats and sometimes cries." +
                " We all help our mother and let her have a rest in the evening." +
                " Then she usually reads a book or just watches TV. My father is a doctor." +
                " He is tall and handsome. He has short dark hair and gray eyes." +
                " He is a very hardworking man. He is rather strict with us, but always fair." +
                " My elder brother Ken is thirteen, and he is very clever.";
        String simple = "and";
        System.out.println(Arrays.toString(arrayList(text,simple).toArray()));
        System.out.print("Кол-во одинаковых слов в тексте: ");
        System.out.println(arrayList(text,simple).size());
    }

    static ArrayList<Integer> arrayList(String text, String simple) {
        ArrayList<Integer> foundWord = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            int j = 0;
            while (i + j < text.length() &&
                    j < simple.length() &&
                    simple.charAt(j) == text.charAt(i+j)) {
                j++;
            }
            if (j == simple.length()) {
                foundWord.add(i);
            }
        }
        return foundWord;
    }

    }



