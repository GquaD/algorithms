package sorting;

import java.util.Arrays;

public class SelectionSort {

    //Time complexity: O(N ^ 2)
    //Space complexity: O(1)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[minIdx] > arr[j])
                    minIdx = j;

            //swapping elements | elementlarning joylarini almashtirish
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 0, 5, 1};
        System.out.println("Before: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
