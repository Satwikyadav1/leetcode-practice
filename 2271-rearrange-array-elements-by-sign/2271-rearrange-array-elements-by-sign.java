class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
ArrayList<Integer> c=new ArrayList<>();
for(int i=0;i<n;i++){
    if(nums[i]>0){
       a.add(nums[i]);
    }
    else{
        b.add(nums[i]);
    }
}
for(int i=0;i<n/2;i++){
    c.add(a.get(i));
    c.add(b.get(i));
}
for(int i=0;i<n;i++){
    nums[i]=c.get(i);
}
return nums;
    }
}