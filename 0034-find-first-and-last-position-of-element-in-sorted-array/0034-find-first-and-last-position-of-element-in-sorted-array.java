// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] ans = {-1, -1};
//         int start=-1, end=-1;
//         int low = 0;
//         int high=nums.length-1, mid=high+(low-high)/2;
        
//         if(nums.length==0) return ans;
//         while(low<high){
//             if(mid==target){
//                 start=mid;
//                 high=mid-1;
//             }
            
//             else if(target<mid){
//                 low++;
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//                 high--;
//             }
//         }
//         ans[0]=start;
//         low=0;
//         high=nums.length-1;
//         mid=high+(low-high)/2;
//         while(low<high){
//             if(mid==target){
//                 end=mid;
//                 low=mid+1;
//             }
            
//             else if(target<mid){
//                 low++;
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//                 high--;
//             }
//         }
//         ans[1]=end;
//         return ans;
//     }
// }

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        return new int[]{
            binarySearch(nums, target, true),    
            binarySearch(nums, target, false)
        };
    }
    
    private int binarySearch(int[] nums, int target, boolean isLeft) {
        int n = nums.length, start = 0, end = n - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2, val = nums[mid];
            if (val == target) {
                if (isLeft && mid - 1 >= 0 && nums[mid - 1] == target) end = mid;
                else if (!isLeft && mid + 1 <= n - 1 && nums[mid + 1] == target) start = mid;
                else return mid;
            } else if (val < target) start = mid;
            else end = mid;
        }
        if (nums[start] == target && nums[end] == target) return isLeft ? start : end;
        if (nums[start] == target) return start;
        if (nums[end] == target) return end;
        return -1;
    }
}