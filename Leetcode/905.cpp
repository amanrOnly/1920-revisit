class Solution {
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
    
    public int[] sortArrayByParity(int[] nums) {
        
        int ei=0, oi=0, size=nums.length;
        if(size==1 || size==0) return nums;
        
        
        while(oi<size){
            if(nums[oi]%2!=0) oi++;
            else{
                swap(nums, oi, ei);
                ++oi;
                ++ei;
                
            }
        }
        
        return nums;
        
    }
}
