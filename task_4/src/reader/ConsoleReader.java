package reader;

import java.util.Scanner;

public class ConsoleReader {
    public static int readNumber() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            in.next();
        }
        return in.nextInt();
    }

    public static int[] readArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = readNumber();
        }
        return array;
    }
}