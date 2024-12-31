class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
int a[]=new int[n/2];
int b[]=new int[n/2];
ArrayList<Integer> c=new ArrayList<>();
int j=0;
int k=0;
for(int i=0;i<n;i++){
    if(nums[i]>0){
      a[j++]=nums[i];
    }
    else{
        b[k++]=nums[i];
    }
}
j=0;
 k=0;
for(int i=0;i<n;i++){
  if(i%2==0){
    nums[i]=a[j++];
  }
  else{
    nums[i]=b[k++];
  }
}
return nums;
    }
}