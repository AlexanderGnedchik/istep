package by.istep.alexniko.model.logic;

import java.util.concurrent.ExecutionException;

public class ArrayManager {

    public static int searchMaxElement(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        for (int temp : array) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static int searchIndexMaxElement(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                index = i;
            }

        }
        return index;
    }

    public static int searchMinElement(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int temp : array) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public static int searchIndexMinElement(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                index = i;
            }

        }
        return index;
    }

    public static int countPositiveElements(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int countMax = 0;
        for (int temp : array) {
            if (temp > 0) {
                countMax++;
            }
        }
        return countMax;
    }

    public static boolean checkElementInArray(int[] array, double elem) {

        boolean answer = false;
        for (double temp : array) {
            if (temp == elem) {
                answer = true;
                return answer;
            }
        }
        return answer;
    }

    public static int searchLastIndexElementInArray(int[] array, double elem) {
        if (array.length == 0) {
            return -1;
        }
        int lastIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }


    public static double countSumBetweenPositiveElements(double[] array) {
        int firstpositive = 0;
        int secondpositive = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                firstpositive = i + 1;
                break;
            }
        }
        for (int i = firstpositive; i < array.length; i++) {
            if (array[i] > 0) {
                secondpositive = i;
                break;
            }
        }
        for (int i = firstpositive; i < secondpositive; i++) {
            sum += array[i];
        }
        return sum;

    }

    public static double findMaxAbsElement(double[] array) {
        if (array.length == 0) {
            return 0;
        }

        double element = array[0];
        double maxElement = array[0];

        for (double temp : array) {
            if (Math.abs(temp) > element) {
                element = Math.abs(temp);
                maxElement = temp;
            }
        }
        return maxElement;
    }
}
