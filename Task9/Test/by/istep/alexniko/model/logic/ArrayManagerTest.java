package by.istep.alexniko.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayManagerTest {

    @Test
    public void searchMaxElementTest() {
        int[] array = {20, 2, 3, -2, 29};
        int expected = 29;
        int actual = ArrayManager.searchMaxElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchMaxElementTest2() {
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        int actual = ArrayManager.searchMaxElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchMaxElementTest3() {
        int[] array = {-1, -43, -3, -2, -12};
        int expected = -1;
        int actual = ArrayManager.searchMaxElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchMaxElementTest4() {
        int[] array = {};
        int expected = 0;
        int actual = ArrayManager.searchMaxElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchIndexMaxElement() {
        int[] array = {1, 43, 3, 2, 123123};
        int expected = 4;
        int actual = ArrayManager.searchIndexMaxElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchIndexMaxElement2() {
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        int actual = ArrayManager.searchIndexMaxElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchIndexMaxElement3() {
        int[] array = {-1, -43, -3, -2, -123123};
        int expected = 0;
        int actual = ArrayManager.searchIndexMaxElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchIndexMaxElement4() {
        int[] array = {};
        int expected = -1;
        int actual = ArrayManager.searchIndexMaxElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchMinElementTest() {
        int[] array = {-100, 2, 3, -2, 9};
        int expected = -100;
        int actual = ArrayManager.searchMinElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchMinElementTest2() {
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        int actual = ArrayManager.searchMinElement(array);
        if (actual != expected) {
            fail();
        }


    }

    @Test
    public void searchMinElementTest3() {
        int[] array = {-10, -2, -12312312, -321, -555};
        int expected = -12312312;
        int actual = ArrayManager.searchMinElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchMinElementTest4() {
        int[] array = {};
        int expected = 0;
        int actual = ArrayManager.searchMinElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchIndexMinElementTest() {
        int[] array = {1, 2, 3, -2, 9};
        int expected = 3;
        int actual = ArrayManager.searchIndexMinElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchIndexMinElementTes2() {
        int[] array = {-10, -2, -12312312, -321, -555};
        int expected = 2;
        int actual = ArrayManager.searchIndexMinElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchIndexMinElementTest3() {
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        int actual = ArrayManager.searchIndexMinElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchIndexMinElementTest4() {
        int[] array = {};
        int expected = -1;
        int actual = ArrayManager.searchIndexMinElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void countPositiveElementsTest() {
        int[] array = {2, 333, 123, -123, 20};
        int expected = 4;
        int actual = ArrayManager.countPositiveElements(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void countPositiveElementsTest2() {
        int[] array = {-2, -333, -123, -123, -20};
        int expected = 0;
        int actual = ArrayManager.countPositiveElements(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void countPositiveElementsTest3() {
        int[] array = {0, 0, 0, 0, 0};
        int expected = 0;
        int actual = ArrayManager.countPositiveElements(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void countPositiveElementsTest4() {
        int[] array = {};
        int expected = -1;
        int actual = ArrayManager.countPositiveElements(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void checkElementInArray() {
        int[] array = {2, 333, 123, -123, 20};
        int searchNumber = 333;
        boolean expected = true;
        boolean actual = ArrayManager.checkElementInArray(array, searchNumber);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void checkElementInArray2() {
        int[] array = {2, 333, 123, -123, 20};
        int searchNumber = 555;
        boolean expected = false;
        boolean actual = ArrayManager.checkElementInArray(array, searchNumber);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void checkElementInArray3() {
        int[] array = {};
        int searchNumber = 0;
        boolean expected = false;
        boolean actual = ArrayManager.checkElementInArray(array, searchNumber);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchLastIndexElementInArrayTest() {
        int[] array = {0, 333, 123, 123, 20};
        int searchNumber = 123;
        int expected = 3;
        int actual = ArrayManager.searchLastIndexElementInArray(array, searchNumber);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchLastIndexElementInArrayTest2() {
        int[] array = {0, 333, 123, 123, 20};
        int searchNumber = 5;
        int expected = -1;
        int actual = ArrayManager.searchLastIndexElementInArray(array, searchNumber);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void searchLastIndexElementInArrayTest3() {
        int[] array = {0, 333, 123, -123, 20};
        int searchNumber = 123;
        int expected = 2;
        int actual = ArrayManager.searchLastIndexElementInArray(array, searchNumber);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void sumBetweenPositiveElementsTest() {
        double[] array = {-1222, 333, -123.123123, -5.55, 20};
        double expected = -128.673123;

        double actual = ArrayManager.countSumBetweenPositiveElements(array);
        assertEquals(expected,actual,0.01);
    }

    @Test
    public void sumBetweenPositiveElementsTest2() {
        double[] array = {1222, 333, -123, -5.55, 20};
        double expected = 0;
        double actual = ArrayManager.countSumBetweenPositiveElements(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void sumBetweenPositiveElementsTest3() {
        double[] array = {-1222, -333, -123, -5.55, -20};
        double expected = 0;
        double actual = ArrayManager.countSumBetweenPositiveElements(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void sumBetweenPositiveElementsTest4() {
        double[] array = {};
        double expected = 0;
        double actual = ArrayManager.countSumBetweenPositiveElements(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void findMaxAbsElement() {
        double[] array = {-35000, -110, -10, 20000, 0};
        double expected = -35000;
        double actual = ArrayManager.findMaxAbsElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void findMaxAbsElement2() {
        double[] array = {0, 0, 0, 0, 0};
        double expected = 0;
        double actual = ArrayManager.findMaxAbsElement(array);
        if (actual != expected) {
            fail();
        }
    }

    @Test
    public void findMaxAbsElement3() {
        double[] array = {};
        double expected = 0;
        double actual = ArrayManager.findMaxAbsElement(array);
        if (actual != expected) {
            fail();
        }
    }
}
