class Solution {
    public int minBitFlips(int start, int goal) {
        //using RSB
        
        int temp = start ^ goal;
        int ans=0;
        while(temp!=0){
            int rsb= temp & -temp;
            temp-=rsb;
            ans++;
        }
        return ans;
    }
}
