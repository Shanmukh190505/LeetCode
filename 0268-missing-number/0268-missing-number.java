class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expsum=n*(n+1)/2;
        int actualsum=0;
        for(int i:nums){
            actualsum=actualsum+i;
        }
        return expsum-actualsum;
    }
}