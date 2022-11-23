class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] map = new int[128];
        int res = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            end = Math.max(end, map[c]);
            res = Math.max(res, i + 1 - end);
            map[c] = i + 1;
         }
    return res;
    }
}