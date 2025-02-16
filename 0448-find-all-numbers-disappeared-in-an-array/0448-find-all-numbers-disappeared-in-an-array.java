class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i:nums){
            int zero_based_index=Math.abs(i)-1;
            if(nums[zero_based_index]>0){
                nums[zero_based_index]*=-1;
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    //     Set<Integer>st =new HashSet<>();
    //     for(int num:nums){
    //         st.add(num);
    //     }
    //     List<Integer>ms=new ArrayList<>();
    //     int n=nums.length;
    //     for(int i=1;i<=n;i++){
    //         if(!st.contains(i)){
    //             ms.add(i);
    //         }
    // }return ms;


    }
}