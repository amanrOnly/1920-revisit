class Solution {
    
    public void reverse(int [] arr, int i, int j){
        int ri=j, li=i;
        while(li<ri){
            int temp = arr[li];
            arr[li++] = arr[ri];
            arr[ri--] = temp;
        }
        
    }
    
    public void rotate(int[] nums, int k) {
        
        int size=nums.length;
        k=(k%nums.length+ size) % size;
    
        reverse(nums, 0, nums.length-1-k);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
}
