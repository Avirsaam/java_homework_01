import java.io.Serial;
import java.lang.reflect.Array;
import java.util.Scanner;

/*
 * *+Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */

public class homework_04 {
    public static void main(String[] args) {
        // (a10 a1) + (b10 b1) = (c10 c1)
        
        int a1,a10,b1,b10,c1,c10 = 0;

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите уравнение в формате 2? + ?5 = 69: ");
        String inputString = myScanner.nextLine();
        
        inputString = inputString.replaceAll(" ","");
        
        if (!inputString.matches("(^([0-9?]{1,2})([ + ]{1,3})([0-9?]{1,2})([ = ]{1,3})([0-9?]{1,2})$)")){
            System.out.println("Неправильный формат введенного выражения");
        }
        else{
            char [] firstNumber  = new char[2];
            char [] secondNumber = new char[2];
            char [] thirdNumber  = new char[2];

            inputString.trim().getChars(0, inputString.indexOf('+'), firstNumber, 0);
            inputString.trim().getChars(inputString.indexOf('+') + 1, inputString.indexOf('='), secondNumber, 0);
            inputString.trim().getChars(inputString.indexOf('=') + 1, inputString.length(), thirdNumber, 0);

            if (firstNumber[1] == 0){
                if (firstNumber[0] == '?') a1 = -1;
                else a1 = firstNumber[0] - 48;
                a10 = 0;
            } else {
                if (firstNumber[1] == '?') a1 = -1;
                else a1 = firstNumber[1] - 48;
                
                if (firstNumber[0] == '?') a10 = -1;
                else a10 = firstNumber[0] - 48;
            };

            if (secondNumber[1] == 0){
                if (secondNumber[0] == '?') b1 = -1;
                else b1 = secondNumber[0] - 48;
                b10 = 0;
            } else {
                if (secondNumber[1] == '?') b1 = -1;
                else b1 = secondNumber[1] - 48;
                
                if (secondNumber[0] == '?') b10 = -1;
                else b10 = secondNumber[0] - 48;
            };

            if (thirdNumber[1] == 0){
                if (thirdNumber[0] == '?') c1 = -1;
                else c1 = thirdNumber[0] - 48;
                c10 = 0;
            } else {
                if (thirdNumber[1] == '?') c1 = -1;
                else c1 = thirdNumber[1] - 48;
                
                if (thirdNumber[0] == '?') c10 = -1;
                else c10 = thirdNumber[0] - 48;
            };  

            boolean flagSuccess = false;

            for (int A10 = 0; A10 < 10; A10++) {
                for (int A1 = 0; A1 < 10; A1++) {
                    for (int B10 = 0; B10 < 10; B10++) {
                        for (int B1 = 0; B1 < 10; B1++) {
                            for (int C10 = 0; C10 < 10; C10++) {
                                for (int C1 = 0; C1 < 10; C1++) {
                                    if (10 * (A10 + B10) + A1 + B1 == C10*10 + C1
                                    && (a10 == -1 || A10 == a10)
                                    && (a1  == -1 || A1  == a1 )
                                    && (b10 == -1 || B10 == b10)
                                    && (b1  == -1 || B1  == b1 )
                                    && (c10 == -1 || C10 == c10)
                                    && (c1  == -1 || C1  == c1 ) ){
                                        System.out.printf("%d + %d = %d\n", A10*10+A1, B10*10+B1, C10*10+C1);
                                        flagSuccess = true;
                                    }
                                }
                            }
                        }
                    }

                }                
            }
            
            if (flagSuccess == false) System.out.println("Выражение данного вида не имеет решений");            
        }
    }
}
