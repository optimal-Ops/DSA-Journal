import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 45, 2, 57, 4};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion_sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }
}
//Optimal
static void insertion_sort(int[] a) {
    int n = a.length;
    for (int i = 1; i < n; i++) {
        int key = a[i];
        int j = i - 1;

        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j]; // Shift right
            j--;
        }
        a[j + 1] = key; // Place key at correct spot
    }
}
