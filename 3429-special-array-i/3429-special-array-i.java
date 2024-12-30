class Solution {
    public boolean isArraySpecial(int[] a) {
        if(a.length==1){
            return true;
        }
        for(int i=0;i<a.length-1;i++){
            int j=i+1;
            if((a[i]%2==0 && a[j]%2==0) || (a[i]%2!=0 && a[j]%2!=0) ){
                return false;
            }
        }
        return true;
    }
}