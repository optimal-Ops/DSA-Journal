class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int left=0;
        int right=0;
        int i=0;
        while(left<m && right<n){
            if(nums1[left]<nums2[right] ){
                ans[i++]=nums1[left++];
                
            }else if(nums1[left]>nums2[right]){
                ans[i++]=nums1[right++];
                
            }
        }
    while(left<m ){
        ans[i++]=nums1[left++];
    }
     while(right<n){
        ans[i++]=nums2[right++];
    }
    for(int j=0;j<m+n;j++){
        nums1[j]=ans[j];
    }
    }
}
//Time limit exceeded


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1; //store from last in nums1 

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
