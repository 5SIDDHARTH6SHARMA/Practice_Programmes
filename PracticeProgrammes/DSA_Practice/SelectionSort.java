package DSA_Practice;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

  // creating an empty array
  private int[] inputArray = new int[1_000];

  Random random = new Random();

  // populating the empty array with random integers

  SelectionSort() {
    for (int i = 0; i < inputArray.length; i++)
      inputArray[i] = random.nextInt(1000000);

    // print unsorted array
    System.out.println(Arrays.toString(inputArray));
    // System.out.println("start");
    sort();
    // System.out.println("finished");

    // print the sorted one
    System.out.println(Arrays.toString(inputArray));
  }

  private void sort() {

    int sizeOfArray = inputArray.length;
    int minimum = 0;
    int location = 0;

    // the outer loop will select each element to compare
    for (int i = 0; i < sizeOfArray - 1; i++) {
      minimum = inputArray[i];
      location = i;
      // inner loop will compare the elements
      for (int j = i + 1; j < sizeOfArray; j++) {
        if (inputArray[j] < minimum) {
          minimum = inputArray[j];
          location = j;
        }
      }
      swap(inputArray, location, i);

    }
  }

  private void swap(int[] inputArray, int location, int i) {
    int temp = inputArray[location];
    inputArray[location] = inputArray[i];
    inputArray[i] = temp;
  }
}
