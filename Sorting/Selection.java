
import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		int[] arr= {3,7,1,45,2,57,4};
		selection_sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static int[] selection_sort(int[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			int mini=i;
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[j]<arr[mini]) {
					mini=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mini];
			arr[mini]=temp;
		}
		return arr;
	}

}
