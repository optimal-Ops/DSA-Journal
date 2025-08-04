class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       HashMap<Integer,Integer> hm =new HashMap<>();
       int n=grid.length;
       for(int i=0;i<n;i++){
        for(int j=0;j<grid[i].length;j++){
            hm.put(grid[i][j],hm.getOrDefault(grid[i][j],0)+1);

        }
       }
     int[] ans=new int[2];
     for (int i = 1; i <= n * n; i++) {
            int count = hm.getOrDefault(i, 0);
            if (count == 2) ans[0] = i;   
            if (count == 0) ans[1] = i; 
        }
        
        return ans;
       
    }
}