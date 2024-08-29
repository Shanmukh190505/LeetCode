class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=0;
        while(n<nums.length){
            if(nums[n]==target)
                return n;
            if(n==0&&target<nums[n])
                return n;
            if(n>0 && target > nums[n-1] && target<nums[n])
                return n;
            n++;

        }
        return n;
    }
}