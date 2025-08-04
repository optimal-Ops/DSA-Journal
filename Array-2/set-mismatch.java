class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] hash=new int[nums.length+1];
        int[] ans=new int[2];
        Arrays.fill(hash,0);
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=1;i<hash.length;i++){
            if(hash[i]>1){
                ans[0]=i;
            }else if(hash[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}
class Solution {
    public int[] findErrorNums(int[] nums) {
       long n=nums.length;
       long sn=(n*(n+1))/2;
       long s2n=(n*(n+1)*(2*n+1))/6;
       long s=0;
       long s2=0;

       for(int i=0;i<n;i++){
        s+=(long)nums[i];
        s2+=(long)nums[i]*(long)nums[i];
       }

       long val1= s-sn; //x-y
       long val2=s2-s2n;//x2-y2 =(x+y)*(x-y)
       val2=val2/val1;
       long x=(val1+val2)/2;
       long y=x-val1;
       int[] ans = {(int)x, (int)y};
       return ans;

    }
}