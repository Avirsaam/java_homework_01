import java.util.Scanner;

/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

public class homework_01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите номер элемента последовательности: ");
        int n = myScanner.nextInt();
        myScanner.close();

        int triangNumber = 0;
        int factorial = 1;
        for (int i = 1; i < n + 1 ; i++) {            
            triangNumber += i;
            factorial *= i;
        }
        System.out.printf("Треугольное число под номером %d равно %d\n", n, triangNumber);
        System.out.printf("Факториал числа %d равен %d\n", n, factorial);        
        
    }
}
