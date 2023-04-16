import java.util.Scanner;

/*
 * Реализовать простой калькулятор
 */

public class homework_03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNumber = myScanner.nextDouble();

        System.out.print("Введите знак операции [+, -, *, / ]: ");
        char operation = myScanner.next().charAt(0);
        
        System.out.print("Введите второе число: ");
        double secondNumber = myScanner.nextDouble();        
        myScanner.close();

        double result = 0;
        boolean success = true;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
        
            case '-':
                result = firstNumber - secondNumber;
                break;
            
            case '*':
                result = firstNumber * secondNumber;
                break;
            
            case '/':
                result = firstNumber / secondNumber;
                break;

            default:
                success = false;
                break;
        }
        if (success){
            System.out.printf("%.2f %c %.2f = %.2f\n", firstNumber, operation, secondNumber, result);
        }
        else{
            System.out.println("Неизвестная операция");
        }
    }
}
