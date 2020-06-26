package by.istep.alexniko.controller;

import by.istep.alexniko.view.Printer;
import by.istep.alexniko.view.UserInput;
import by.istep.alexniko.model.logic.ArrayManager;

public class Main {

    public static void main(String[] args) {
        Printer.printer("Main Task for array of type int:\n");
        int arraySize = UserInput.inputSizeArray("Input size array: ");
        int[] array = UserInput.inputElementsArray(arraySize);

        int maxElement = ArrayManager.searchMaxElement(array);
        int indexMaxElement = ArrayManager.searchIndexMaxElement(array);
        int minElement = ArrayManager.searchMinElement(array);
        int indexMinElement = ArrayManager.searchIndexMinElement(array);
        int numberPositiveElements = ArrayManager.countPositiveElements(array);

        Printer.printer("\nMaxElement: " + maxElement);
        Printer.printer("Index max element: " + indexMaxElement);
        Printer.printer("MinElement: " + minElement);
        Printer.printer("Index min Element: " + indexMinElement);
        Printer.printer("Number positive elements: " + numberPositiveElements);

        Printer.printer("\nCheck element of array");
        int searchElement = UserInput.inputElementForSearch("Enter element for search: ");
        boolean checkElement = ArrayManager.checkElementInArray(array, searchElement);
        Printer.printer("Element is have: " + checkElement);

        Printer.printer("\nFind index of last element");
        searchElement = UserInput.inputElementForSearch("Enter element for search: ");
        int indexLastElement = ArrayManager.searchLastIndexElementInArray(array, searchElement);
        Printer.printer("Index Last Element: " + indexLastElement);

        Printer.printer("\nIndividual Task for array of type double:");

        arraySize = UserInput.inputSizeArray("Input size array: ");
        double[] doubleArray = UserInput.inputElementsDoubleArray(arraySize);
        double sumDoubleElements = ArrayManager.countSumBetweenPositiveElements(doubleArray);
        double maxDoubleElement = ArrayManager.findMaxAbsElement(doubleArray);
        Printer.printer("\nSum elements between positive: " + sumDoubleElements);
        Printer.printer("Max abs element: " + maxDoubleElement);
    }
}
