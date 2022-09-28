class Solution {
    public int search(int[] nums, int target) {
        int left=0, n=nums.length, right=n-1;
        if(n==0) return -1;
        
        while(left<=right){
        int mid=(left+right)/2;    
        if(nums[mid]==target) return mid;
        else if(nums[mid] < target) left=mid+1;
        else right=mid-1;
        }
        return -1;
    }
}
