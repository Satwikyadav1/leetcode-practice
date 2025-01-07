class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
      double n=salary.length;
      double c=0;
      double b=n-2;
       for(int i=1;i<=n-2;i++){
        c=c+salary[i];
       }
       double d=c/b;
       return d;
      
    }
}