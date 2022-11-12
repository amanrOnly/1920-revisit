class Solution {
    public int findLucky(int[] arr) {
        int[] nums = new int[501];
        
        for(int temp: arr){
            nums[temp]+=1;
        }
        int ans=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==i && i>ans) ans=i;
        }
        return (ans==0)?-1:ans;
    }
}