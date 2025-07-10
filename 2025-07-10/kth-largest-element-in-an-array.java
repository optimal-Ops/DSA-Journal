<<<<<<< HEAD
//approch-1
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

//approch-2
class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int num:nums){
        pq.add(num);
        if(pq.size()>k){
             pq.poll();
        }
      }
      return pq.peek();
    }
}

//approch-3
class Solution {
    public int findKthLargest(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        return quickSelect(arr, low, high, k);
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        int pivotInd = partition(arr, low, high);

        if (pivotInd == k - 1) {
            return arr[pivotInd]; // If the pivot is at the (k-1)th index, it's the Kth largest
        } else if (pivotInd < k - 1) {
            return quickSelect(arr, pivotInd + 1, high, k); // Search in the right
        } else {
            return quickSelect(arr, low, pivotInd - 1, k); // Search in the left 
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; 
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] > pivot) i++;  // Move right until finding a value smaller than or equal to pivot
            while (j >= low + 1 && arr[j] <= pivot) j--; // Move left until finding a value greater than pivot

            if (i < j) {
                swap(arr, i, j); // Swap values at i and j if they are out of order
            }
        }

        swap(arr, low, j); // Place the pivot in its correct position
        return j; 

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
=======
//approch-1
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

//approch-2
class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int num:nums){
        pq.add(num);
        if(pq.size()>k){
             pq.poll();
        }
      }
      return pq.peek();
    }
}

//approch-3
class Solution {
    public int findKthLargest(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        return quickSelect(arr, low, high, k);
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        int pivotInd = partition(arr, low, high);

        if (pivotInd == k - 1) {
            return arr[pivotInd]; // If the pivot is at the (k-1)th index, it's the Kth largest
        } else if (pivotInd < k - 1) {
            return quickSelect(arr, pivotInd + 1, high, k); // Search in the right
        } else {
            return quickSelect(arr, low, pivotInd - 1, k); // Search in the left 
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; 
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] > pivot) i++;  // Move right until finding a value smaller than or equal to pivot
            while (j >= low + 1 && arr[j] <= pivot) j--; // Move left until finding a value greater than pivot

            if (i < j) {
                swap(arr, i, j); // Swap values at i and j if they are out of order
            }
        }

        swap(arr, low, j); // Place the pivot in its correct position
        return j; 

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
>>>>>>> 4eed470 (Save local changes before rebase)
