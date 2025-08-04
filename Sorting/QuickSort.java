package sorting_1;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quick_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionInd = partition(arr, low, high);
            quick_sort(arr, low, partitionInd - 1);
            quick_sort(arr, partitionInd + 1, high);
        }
        return arr;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j >= low && arr[j] > pivot) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
}
