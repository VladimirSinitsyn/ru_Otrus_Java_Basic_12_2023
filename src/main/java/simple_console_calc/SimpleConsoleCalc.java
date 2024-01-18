package simple_console_calc;

import java.util.Scanner;

public class SimpleConsoleCalc {

    public static void main(String[] args) {

        simpleConsoleCalculator();
    }

    public static void simpleConsoleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input first number");
        float a = scanner.nextFloat();
        System.out.println("Please, input second number");
        float b = scanner.nextFloat();
        System.out.println("Please, choose operation type: +, -, * or /");
        char operation = scanner.next().charAt(0);
        float result = 0f;
        if (operation == '+') {
            result = a + b;

        } else if (operation == '-') {
            result = a - b;

        } else if (operation == '*') {
            result = a * b;

        } else if (operation == '/') {
            result = a / b;


        } else
            System.out.println("You've been chosen undefined operation type");
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }

}
