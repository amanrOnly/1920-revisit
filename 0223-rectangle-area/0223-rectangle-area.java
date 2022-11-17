// class Solution {
//     public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
//         int x1=Math.max(ax1, bx1);
//         int y1=Math.max(ay1, by1);
//         int x2=Math.min(ax2,bx2);
//         int y2=Math.min(ay2,by2);
//         int area1=(ax1-ax2)*(ay1-ay2);
//         int area2=(bx1-bx2)*(by1-by2);
        
//         if(ax1>=bx1 || ay1>=by1 || ax2<=bx2 || ay2<=by2){
//             return area1+area2;
//         }
    
//         return (area1+area2)-((x1-x2)*(y1-y2));
//     }
// }
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a = (ax2 - ax1) * (ay2 - ay1);
        int b = (bx2 - bx1) * (by2 - by1);
        int width = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int height = Math.min(ay2, by2) - Math.max(ay1, by1);
        return a + b - Math.max(height, 0) * Math.max(width, 0);
    }
}