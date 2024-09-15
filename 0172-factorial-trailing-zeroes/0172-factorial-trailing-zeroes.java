class Solution {
    public int trailingZeroes(int n) {
        if(n==0){
            return 0;
        }
        // int sum=0;
        // for(int i=2;i<=n;i++){
        //     sum=sum+i;
        // }
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }
}