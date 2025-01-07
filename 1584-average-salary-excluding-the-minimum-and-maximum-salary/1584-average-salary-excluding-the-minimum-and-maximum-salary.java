class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
       int c=0;
       int b=n-2;
       for(int i=1;i<=n-2;i++){
        c=c+salary[i];
       }
       double d=(double)c/b;
       return d;
      
    }
}