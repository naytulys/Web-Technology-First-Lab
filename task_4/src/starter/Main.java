package starter;

import check.PrimeChecker;
import reader.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size:");
        int size = ConsoleReader.readNumber();
        System.out.println("Enter numbers:");
        int[] array = ConsoleReader.readArray(size);
        System.out.println(PrimeChecker.getPrimesPositionsInArray(array));
    }
}
