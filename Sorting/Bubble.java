import java.util.Arrays;

public class bubble {

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 45, 2, 57, 4};
        System.out.println(arr.length);
        bubble_sort(arr); 
        System.out.println(Arrays.toString(arr)); 
    }

    static int[] bubble_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
