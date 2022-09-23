class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        int sum=0, max=nums[0];
        for(auto x: nums){
            if(sum<0) sum=0;
            sum+=x;
            if(sum>max) max=sum;
        }
        
        return max;
    }
};
