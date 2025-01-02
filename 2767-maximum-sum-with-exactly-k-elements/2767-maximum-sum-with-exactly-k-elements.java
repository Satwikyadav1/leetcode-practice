class Solution {
    public int maximizeSum(int[] a, int k) {
        Arrays.sort(a);
        int sum=0;
    int n=a.length;
    sum=a[n-1];
        for(int i=1;i<k;i++){
           
           a[n-1]=a[n-1]+1;
           sum +=a[n-1];
        }
        return sum;
    }
}