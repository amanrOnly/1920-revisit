/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int left=1, right=n, mid=(left+right)/2;
        
        while(left<=right){
           mid=left+(right-left)/2;
            switch(guess(mid)){
                case -1:
                    right=mid-1;
                    break;
                case 1:
                    left=mid+1;
                    break;
                case 0:
                    return mid;
            }
        }
        return mid;
    }
}