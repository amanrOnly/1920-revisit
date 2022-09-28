class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length, i=0;
        if(n==0 || n==1) return n;
        
        for(int j=1; j<n; ++j){
            if(nums[i]!=nums[j]){
                ++i;
                nums[i]=nums[j];
            }
        }
        
        return i+1;
    }
}
