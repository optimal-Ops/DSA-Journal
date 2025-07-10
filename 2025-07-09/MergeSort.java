
import java.util.*;

public class Merge {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void merge(int[] arr, int l, int m, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m + 1;

        while (left <= m && right <= r) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= m) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= r) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}
