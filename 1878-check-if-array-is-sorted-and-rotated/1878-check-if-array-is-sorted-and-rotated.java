class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int b[]=Arrays.copyOf(nums,n);  
        int a[]=new int[n];
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
           int k=i+1;
            for(int j=0;j<n;j++){
        a[(j+k)%n]=nums[j];
            }
            if(Arrays.equals(a,b)){
                return true;
            }
        }
        return false;
    }
}