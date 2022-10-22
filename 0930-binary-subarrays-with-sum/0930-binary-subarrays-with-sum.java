class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
//         if(nums==null || nums.length==0) return 0;
        
//         int subAr=0, csum=0, left=0, right=0, n=nums.length;
//         while(left<n && right <n){
            
//             csum+=nums[right];
//             if(csum<goal) right++;
//             else if(csum>goal){
//                 left++;
//                 right=left;
//                 csum=0;
//             }
//             else{
//                 subAr++;
//                 right++;
//                 if(right==n){

//                     left++;
//                     right=left;
//                     csum=0;
//                 }
//             }
//         } 
//         return subAr;
        
        int res=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0; i<nums.length; ++i){
            sum+=nums[i];
            int rsum=sum-goal;
            if(map.containsKey(sum-goal)){

                res+=map.get(sum-goal);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}