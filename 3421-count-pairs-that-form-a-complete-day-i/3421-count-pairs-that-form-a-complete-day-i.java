class Solution {
    public int countCompleteDayPairs(int[] a) {
        int c=0;
        for(int i=0;i<a.length-1;i++){
           for(int j=i+1;j<a.length;j++){
         int sum=a[i]+a[j];
         if(sum%24==0){
            c++;
         }
           }
        }
        return c;
    }
}