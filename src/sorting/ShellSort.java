package sorting;

import java.util.Arrays;

public class ShellSort {

    //Time complexity:
    // Average: O(N ^ (3/2))
    // Worst: O(N ^ 2)
    //Space complexity: O(1)
    public static void shellSort(int[] array) {
        int inner, outer, temp;

        int h = 1;
        while (h <= array.length / 3)
            h = h * 3 + 1;

        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;

                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 3, 1, 8, 7, 2, 4, 10, 9};
        System.out.println("Before: " + Arrays.toString(arr));
        shellSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
