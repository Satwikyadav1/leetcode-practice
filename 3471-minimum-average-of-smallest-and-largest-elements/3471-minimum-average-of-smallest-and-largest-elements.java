class Solution {
    public double minimumAverage(int[] nums) {
   Arrays.sort(nums);
   int n=nums.length;
   int j=n-1;
   double min=Integer.MAX_VALUE;
   double c;
   for(int i=0;i<n/2;i++){
c=(nums[i]+nums[j])/2.0;
if(min>c){
    min=c;
}
j--;
   }
   return min;
    }
}