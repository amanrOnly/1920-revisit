class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int o=0;
        while(i<nums.length){

            if(nums[i]==0) k--;
            if(k<0 && nums[o++] == 0) k++;
            i++;
        }
        return i-o;
    }
    
}