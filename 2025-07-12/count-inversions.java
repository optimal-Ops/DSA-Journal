//approch 1
class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i<j && arr[i]> arr[j]){
                    count++;
                }
            }
        }
        return count;
         
    }
}


//approch 2
class Solution {
    static int inversionCount(int arr[]) {
       int cnt= mergeSort(arr,0,arr.length-1);
         return cnt;
    }
    
    static int mergeSort(int[] arr, int low,int high){
        int cnt=0;
        if(low>=high)
            return 0;
            int mid=(low+high)/2;
            
        // Count inversions in left half
        cnt += mergeSort(arr, low, mid);
        // Count inversions in right half
        cnt += mergeSort(arr, mid + 1, high);
        // Count inversions while merging two sorted halves
        cnt += merge(arr, low, mid, high);
        return cnt;
        
    }
    
    static int merge(int[] arr,int low,int mid,int high){
        int cnt=0;
        int left=low;
        int right=mid+1;
        List<Integer> temp=new ArrayList<>();
       
        while(left<= mid && right<= high){
            if(arr[left]<arr[right])
           { temp.add(arr[left]);
            left++;}
        else{
            // Inversion found: arr[left] > arr[right]
                // Since both halves are sorted, all elements from left to mid are > arr[right]
                // So total inversions = (mid - left + 1)
            cnt+=(mid-left+1);
            temp.add(arr[right]);
            right++;
        }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
         while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
        
        return cnt;
    }
}