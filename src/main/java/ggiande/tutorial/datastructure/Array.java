package ggiande.tutorial.datastructure;

/**
* Demonstrate the abilities of
* an Array as well as it's limitations
*/
public class Array {

    /** Prints all values from an array by
     * iterating through their indexes
     * @param arrayOfIntegers An array of integers
     */
    public void printArrayElementsByIndex(int[] arrayOfIntegers) {
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            System.out.println(arrayOfIntegers[i]);
        }
    }

    /** Prints all elements from an array by iterating through the array's elements.
     * @param arrayOfIntegers An array of integers */
    public void printArrayElements(int[] arrayOfIntegers) {
        for (Integer number : arrayOfIntegers) {
            System.out.println(number);
        }
    }

    /**
     * Removes an element from an array.
     * @param index index to remove from an array
     *
     */
    public void removeElementFromArray(int[] arrayOfIntegers, int index) throws IndexOutOfBoundsException {
        for (int i = index; i < arrayOfIntegers.length - 1; i++) {
            arrayOfIntegers[i] = arrayOfIntegers[i + 1];
        }
    }

}
