package sorting;

import java.util.Arrays;

public class BubbleSort {

    //Time complexity: O(N ^ 2)
    //Space complexity: O(1)
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swapping elements | elementlarning joylarini almashtirish
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] -= arr[j + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 0, 5, 1};
        System.out.println("Before: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
