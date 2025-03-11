package DSA_Practice;

import java.util.Random;

public class MergeSort {

  Random random = new Random();
  // Create an empty array called inputArray
  private int[] inputArray = new int[500];

  // populate the inputArray with random numbers
  MergeSort() {
    for (int i = 0; i < inputArray.length; i++) {
      inputArray[i] = random.nextInt(1_000);
    }
    System.out.println("The unsorted array is: ");

    for (int i = 0; i < inputArray.length; i++)
      System.out.println(inputArray[i]);

    mergeSort(inputArray);
  }

  private void mergeSort(int[] inputArray) {

    // checks if the array is of size 1 only, it will stop the recurrsion then
    if (inputArray.length < 2)
      return;

    // dividing the inputArray into two sub arrays
    int middleIndex = inputArray.length / 2;
    int[] leftArray = new int[middleIndex];
    int[] rightArray = new int[inputArray.length - middleIndex];

    // populating the sub arrays
    for (int i = 0; i < leftArray.length; i++)
      leftArray[i] = inputArray[i];

    for (int i = 0; i < rightArray.length; i++)
      rightArray[i] = inputArray[middleIndex + i];

    // recurrsive call to mergeSort
    mergeSort(leftArray);
    mergeSort(rightArray);

    merge(leftArray, rightArray, inputArray);

  }

  private void merge(int[] leftArray, int[] rightArray, int[] inputArray) {
    int i = 0, j = 0, k = 0;

    // Merge elements while both arrays have elements left
    while (i < leftArray.length && j < rightArray.length) {
      if (leftArray[i] <= rightArray[j]) {
        inputArray[k++] = leftArray[i++];
      } else {
        inputArray[k++] = rightArray[j++];
      }
    }

    // Copy remaining elements from leftArray (if any)
    while (i < leftArray.length) {
      inputArray[k++] = leftArray[i++];
    }

    // Copy remaining elements from rightArray (if any)
    while (j < rightArray.length) {
      inputArray[k++] = rightArray[j++];
    }
  }

  public void printSortedArray() {
    System.out.println("The sorted array is ");

    for (int i = 0; i < inputArray.length; i++)
      System.out.println(inputArray[i]);
  }

}
