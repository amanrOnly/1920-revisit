class Solution {
    public int majorityElement(int[] nums) {
        //Moori voting Algorithm
        
        int count=0, element=0;
        for(int i=0; i<nums.length; ++i){

        if(count==0) element=nums[i];
        if(element==nums[i]) ++count;
        else --count;
            
        }
        return element;
    }
}
