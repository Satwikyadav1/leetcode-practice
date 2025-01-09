class Solution {
    static void swap(int a[],int b,int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }
    public void sortColors(int[] a) {
          int low=0;
          int mid=0;
          int high=a.length-1;
          while(mid<=high){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else if(a[mid]==2){
swap(a,mid,high);
high--;
            }
          }
    }
}