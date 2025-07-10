class Solution {
    public int getSecondLargest(int[] arr) {
       //sorting
        Arrays.sort(arr);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                return arr[i];
            }
        }
        return -1;

    }
}


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int maxi=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi ){

                 secMax=maxi;
                 maxi=arr[i];
            }else if(arr[i]> secMax && arr[i]!=maxi){
                secMax=arr[i];
            }
        }

return secMax ==Integer.MIN_VALUE ? -1: secMax ;
    }
}