
class Solution {
    public void nearlySorted(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) { // handle duplicates
            while (i <= high && arr[i] <= pivot) i++;
            while (j >= low + 1 && arr[j] > pivot) j--;

            if (i < j) swap(arr, i, j);
        }

        swap(arr, low, j); 
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Solution {
    public void nearlySorted(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) { // handle duplicates
            while (i <= high && arr[i] <= pivot) i++;
            while (j >= low + 1 && arr[j] > pivot) j--;

            if (i < j) swap(arr, i, j);
        }

        swap(arr, low, j); 
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
