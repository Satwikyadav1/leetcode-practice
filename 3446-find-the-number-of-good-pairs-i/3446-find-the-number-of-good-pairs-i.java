class Solution {
    public int numberOfPairs(int[] a, int[] b, int k) {
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]%(b[j]*k)==0){
                    c++;
                }
            }
        }
        return c;
    }
}