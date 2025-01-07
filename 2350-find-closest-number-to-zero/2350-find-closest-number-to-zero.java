class Solution {
    public int findClosestNumber(int[] nums) {
        int a=nums.length;
        int temp[]=new int[a];
       int c=0;
        for(int i=0;i<a;i++){
            int b=nums[i];
            temp[i]=Math.abs(b);
        }
         int less=temp[0];
        for(int j=1;j<a;j++){
            if(less > temp[j] || (less == temp[j] && nums[j] > nums[c])){
                less=temp[j];
                  c=j;
                   }
            
        }
        return nums[c];
    }
}