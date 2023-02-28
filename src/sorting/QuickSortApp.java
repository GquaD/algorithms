package sorting;

import java.util.Arrays;

public class QuickSortApp {

    //Time complexity:
    //  Best case: O(N * logN)
    //  Worst case: O(N ^ 2)

    //Space complexity: O(1)

    private static class QuickSort {
        private int[] array;

        public void quickSort(int[] arr) {
            array = arr;
            recursiveQuickSort(0, array.length - 1);
        }

        private void recursiveQuickSort(int left, int right) {
            if (right - left <= 0) {
                return;
            } else {
                int pivot = array[right];
                int partition = partitionIt(left, right, pivot);
                recursiveQuickSort(left, partition - 1);
                recursiveQuickSort(partition + 1, right);
            }
        }

        private int partitionIt(int left, int right, int pivot) {
            int leftPointer = left - 1;
            int rightPointer = right;
            while (true) {
                while (array[++leftPointer] < pivot);

                while (rightPointer > 0 && array[--rightPointer] > pivot);

                if (leftPointer >= rightPointer) {
                    break;
                } else {
                    swap(leftPointer, rightPointer);
                }
            }
            swap(leftPointer, right);
            return leftPointer;
        }

        private void swap(int idx1, int idx2) {
            int temp = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = temp;
        }
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Before: " + Arrays.toString(arr));
        quickSort.quickSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
