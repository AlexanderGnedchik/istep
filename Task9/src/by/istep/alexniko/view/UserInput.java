package by.istep.alexniko.view;

import java.util.Scanner;

public class UserInput {
    public static Scanner scanner = new Scanner(System.in);

    public static int inputSizeArray(String msg) {
        System.out.print(msg);
        int sizeArray = scanner.nextInt();
        while (sizeArray > 5) {
            System.out.println("Your size must be less 6");
            System.out.println(msg);
            sizeArray = scanner.nextInt();
        }
        return sizeArray;
    }

    public static int[] inputElementsArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + "[" + i + "]: ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        return array;
    }

    public static double[] inputElementsDoubleArray(int size) {
        double[] array = new double[size];
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + "[" + i + "]: ");
            double element = scanner.nextDouble();
            array[i] = element;
        }
        return array;
    }

    public static int inputElementForSearch(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }
}
