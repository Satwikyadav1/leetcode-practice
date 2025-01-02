class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int a[]=new int[n-1];
        StringBuilder right=new StringBuilder(s);
        StringBuilder left=new StringBuilder();
       
        for(int i=0;i<a.length;i++){
             int b0=0;
                     int c1=0;
                     char f=right.charAt(0);
left.append(f);
right.deleteCharAt(0);

for(int j=0;j<left.length();j++){
    if(left.charAt(j)=='0'){
        b0++;
    }
}
for(int j=0;j<right.length();j++){
    if(right.charAt(j)=='1'){
        c1++;
        }
    }
a[i]=b0+c1;                
}
    int maxScore = 0;
    for(int i=0;i<a.length;i++) {
        if (a[i] > maxScore) {
            maxScore = a[i];
                }       
                 }
        return maxScore;
    }
}