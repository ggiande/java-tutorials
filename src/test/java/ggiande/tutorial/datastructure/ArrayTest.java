package ggiande.tutorial.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;

class ArrayTest {
  int[] arrayOfIntegers;

  @Mock
  Array arrayClass;
  @BeforeEach
  void setUp() {
    // TODO: Init the Array that will always be used
    arrayOfIntegers = new int[]{1, 2, 3, 4, 5};
  }

  @Test
  void printArrayElementsByIndex(int[] arrayOfIntegers) {
//    verify(arrayClass.printArrayElementsByIndex(arrayOfIntegers), isA(ArrayList()));
  }

  @Test
  void printArrayElements() {
  }

  @Test
  void removeElementFromArray() {
  }

  @Test
  void testPrintArrayElementsByIndex() {
  }

  @Test
  void testPrintArrayElements() {
  }

  @Test
  void testRemoveElementFromArray() {
  }

  @Test
  void accessValue() {
  }

  @Test
  void updateValue() {
  }

  @Test
  void getArrayLength() {
  }
}