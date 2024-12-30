class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
   int prev[]=new int[n];
   int next[]=new int[n];
   for(int i=0;i<n;i++){
    int a=(i==0)?1:prev[i-1];
    int b=(i==0)?1:nums[i-1];
    prev[i]=a*b;
   }
     for(int i=n-1;i>=0;i--){
            int a=(i==n-1)?1:next[i+1];
                int b=(i==n-1)?1:nums[i+1];
                    next[i]=a*b;
                       }
for(int i=0;i<n;i++){
    nums[i]=prev[i]*next[i];
}
return nums;
}
}