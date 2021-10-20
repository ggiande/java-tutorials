package ggiande.tutorial.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTest {

  int[] arrayOfIntegers;
  Array array;

  @BeforeEach
  void setUp() {
    arrayOfIntegers = new int[]{1, 2, 3, 4, 5};
    array = new Array();
  }

  @Test
  void testPrintArrayElements() {
    String expectedString = "[1, 2, 3, 4, 5]";
    Array array = new Array();
    assertEquals(expectedString, array.printArrayElements(arrayOfIntegers));
  }

  @Test
  void testRemoveElementFromArray() {
    int index = 2;
    int[] updatedArrayOfIntegers = new int[]{1, 2, 4, 5};
    assertArrayEquals(updatedArrayOfIntegers, array.removeElementFromArray(arrayOfIntegers, index));
  }

  @Test
  void accessValue() {
    int index = 3;
    int accessedValue = arrayOfIntegers[3];
    assertEquals(accessedValue, array.accessValue(arrayOfIntegers, index));
  }

  @Test
  void updateValue() {
    int index = 3;
    int value = 100;
    arrayOfIntegers[index] = value;
    assertArrayEquals(arrayOfIntegers, array.updateValue(arrayOfIntegers, index, value));
  }

  @Test
  void getArrayLength() {
    int lengthOfArray = arrayOfIntegers.length;
    assertEquals(lengthOfArray, array.getArrayLength(arrayOfIntegers));
  }
}
