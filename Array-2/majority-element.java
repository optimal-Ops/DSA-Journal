class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()> n){
                return entry.getKey();
            }
        }
        return -1;
    }
}

//moores voting algorithm
// Maintain count and element; set element to current number when count is 0, increment count if same, else decrement.
// After traversal, element holds the majority element.
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                ele = nums[i];
            }
            cnt += (nums[i] == ele)? 1 : -1;
        }
        
        // Verify that ele is the majority element exist
        cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) {
                cnt++;
            }
        }
        
        return cnt > n / 2? ele : -1;
   
    }
}