class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int mi = 1;
       int ma = Integer.MAX_VALUE;
       while(mi<ma){
        int mid = mi+(ma-mi)/2;
        int t = 0;
        for(int b: piles)t+=(b+mid-1)/mid;
        if(t<=h) ma=mid;
        else mi = mid+1;
       }
    return mi;
    }
}
