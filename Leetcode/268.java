  class Solution {
    public int missingNumber(int[] nums) {
        int aSum=0, n=nums.length;
        int sum=(n*(n+1))/2;
        
        for(int i=0; i<n; ++i){
            aSum+=nums[i];
        }
        return sum-aSum;
    }
}
