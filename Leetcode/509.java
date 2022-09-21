class Solution {
public:
    int fib(int n) {
    
        int arr[n+2];
        arr[0]=0;
        arr[1]=1;

        if(n==0) return 0;
        if(n==1) return 1;
        
        for(int i=2; i<=n; i++){
            arr[i]=arr[i-2] + arr[i-1];
        }
        
        return arr[n];
    }
};
