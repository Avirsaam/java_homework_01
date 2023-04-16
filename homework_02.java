
/*
 * Вывести все простые числа от 1 до 1000
 */

public class homework_02 {
    
    public static void main(String[] args) {
        final int MAX_NUMBER = 1000;

        for (int i = 2; i < MAX_NUMBER + 1; i++) {            
            boolean thisNumberIsPrime = true;
            for (int j = 2; j*j < i; j++) {
                if (i % j == 0){
                    thisNumberIsPrime = false;
                    break;                
                }
            }
            if (thisNumberIsPrime) System.out.print(i+ ", ");
        }
        System.out.println();
    }
}
