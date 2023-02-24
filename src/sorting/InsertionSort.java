package sorting;

import java.util.Arrays;

public class InsertionSort {
    //Best case scenario: O(N)
    //Time complexity: O(N ^ 2)
    //Space complexity: O(1)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int idx = i - 1;

            while (idx >= 0 && arr[idx] > temp) {
                arr[idx + 1] = arr[idx];
                idx--;
            }
            arr[idx + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Before: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
    }
