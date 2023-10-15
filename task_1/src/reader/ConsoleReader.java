package reader;

import java.util.Scanner;

public class ConsoleReader {
    public static double readNumber() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextDouble()) {
            in.next();
        }
        return in.nextDouble();
    }
}