class Solution {
    public boolean isPalindrome(int x) {
//         if(x<0) return false;
//         int temp=0;
        
//         if(x>=0 && x<=9) return true;
//         else if(x%10==0) return false;
        
//         while(x>=temp){
//             if(x==temp) return true;
//             temp=temp*10 + x%10;
//             if(x==temp) return true;
//             x=x/10;
//         }
//         return false;
        int palindrome = x;
        int reverse = 0;
        while (palindrome !=0 && x > 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
            
        }
        if (x == reverse){
            return true;
        }
        return false;
    }
}