package ggiande.tutorial.datastructure;

/**
* Demonstrate the abilities of an array as well as it's limitations.
*/
public class Array {

    /** ACCESS ALL values from an array by iterating through their indexes.
     * @param arrayOfIntegers An array of integers
     */
    public void printArrayElementsByIndex(int[] arrayOfIntegers) {
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            System.out.println(arrayOfIntegers[i]);
        }
    }

    /** ACCESS ALL elements from an array by iterating through the array's elements.
     * @param arrayOfIntegers an array of integers */
    public void printArrayElements(int[] arrayOfIntegers) {
        for (Integer number : arrayOfIntegers) {
            System.out.println(number);
        }
    }

    /**
     * REMOVES an element from an array.
     * @param index index to remove from an array
     * @param arrayOfIntegers an array of integers
     * Throws IndexOutOfBoundsException when index is not in array
     */
    public void removeElementFromArray(int[] arrayOfIntegers, int index) throws IndexOutOfBoundsException {
        for (int i = index; i < arrayOfIntegers.length - 1; i++) {
            arrayOfIntegers[i] = arrayOfIntegers[i + 1];
        }
    }

    /**
     * ACCESS A specific value from an array given an index.
     * @param index index to access from an array
     * @param arrayOfIntegers an array of integers
     * Throws IndexOutOfBoundsException when index is not in array
     * */
    public void accessValue (int[] arrayOfIntegers, int index) throws IndexOutOfBoundsException {
        int valueFromIndex = 0;
        valueFromIndex = arrayOfIntegers[index];
        System.out.println(valueFromIndex);
    }

    /**
     * UPDATE a value from an array given an index.
     * @param arrayOfIntegers an array of integers
     * @param index index to access from an array
     * @param value value to replace the value at the index
     * Throws IndexOutOfBoundsException when index is not in array */
    public void updateValue(int[] arrayOfIntegers, int index, int value) throws IndexOutOfBoundsException {
        arrayOfIntegers[index] = value;
    }
    /**
     * RETRIEVES the length of the array.
     * @param arrayOfIntegers an array of integers
     * Throws IndexOutOfBoundsException when index is not in array */
    public void getArrayLength(int[] arrayOfIntegers) {
        System.out.println("Size of Array: " + arrayOfIntegers.length);
    }
}
