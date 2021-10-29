class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0, e=numbers.length-1;

        while(s<e){
            int cSum = numbers[s]+numbers[e];

            if(cSum==target) return new int[]{s+1, e+1};

            else if(cSum>target){
                --e;
            }

            else ++s;

        }

        return new int[]{-1,-1};
    }
}
