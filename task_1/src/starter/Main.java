package starter;

import calculator.ExpressionCalculator;
import reader.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter x: ");
        double x = ConsoleReader.readNumber();
        System.out.println("Enter y: ");
        double y = ConsoleReader.readNumber();
        System.out.printf("The result is %f", ExpressionCalculator.getInstance().getResult(x,y));
    }
}