class Solution {
    public int characterReplacement(String s, int k) {
//          int[] count = new int[26];
//         int maxCount = 0; 
//         int maxLength = 0;

//         int left = 0;

//         for (int right = 0; right < s.length(); right++) {
//             count[s.charAt(right) - 'A'] += 1;
//             maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
//             while (right - left + 1 - maxCount > k) {
//                 count[s.charAt(left) - 'A'] -= 1;
//                 left++;
//             }
//             maxLength = Math.max(maxLength, right - left + 1);
//         }
//         return maxLength;
        if(s == null || s.length() == 0){
            return 0;
        }
        int max = 0;
        int[] ch = new int[26];
        char[] str = s.toCharArray();
        for(int i=0, j=0; i<s.length(); i++){
            while(j < s.length()){
                ch[str[j] - 'A']++;
                if(count(ch) > k){  //If exceed k, break
                    ch[str[j] - 'A']--;
                    break;
                }
                j++;
            }
            max = Math.max(max, j-i);
            ch[str[i] - 'A']--;
        }
        return max;
    }
    //Count the number of character that is different to the longest character
    public int count(int[] ch){
        int max = 0;
        int sum = 0;
        for(int val:ch){
            sum += val;
            max = Math.max(max, val);
        }
        return sum - max;
    }
}