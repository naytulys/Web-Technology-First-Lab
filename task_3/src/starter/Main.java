package starter;

import calculator.FunctionCalculator;
import reader.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a:");
        double a = ConsoleReader.readNumber();
        System.out.println("Enter b:");
        double b = ConsoleReader.readNumber();
        System.out.println("Enter step:");
        double step = Math.abs(ConsoleReader.readNumber());
        FunctionCalculator.calculate(a, b, step)
                .forEach((v, f) -> System.out.printf("%10.4f|%10.4f|\n----------+----------+\n", v, f));
    }
}
