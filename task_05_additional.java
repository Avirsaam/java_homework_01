import java.util.Arrays;

/*
 * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */

public class task_05_additional {
    public static void main(String[] args) {
        String myString = "Добро пожаловать на курс по Java";
        String [] words = myString.split(" ");
        
        for (int i = words.length - 1; i > -1; i--) {
            System.out.print(words[i] + " ");            
        }
        System.out.println();
    }
}
