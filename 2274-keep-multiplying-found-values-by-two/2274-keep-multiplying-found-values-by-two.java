class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans=original;
        for(int i=0;i<nums.length;i++){
if(nums[i]==original){
    original=original*2;
   ans=findFinalValue(nums,original);
}
        }
        return ans;
    }
}