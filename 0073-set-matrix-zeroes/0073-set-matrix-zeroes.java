class Solution {
    public void setZeroes(int[][] a) {
        int m=a.length, n=a[0].length;
        int b[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=a[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                   for(int v=0;v<m;v++){
                    b[v][j]=0;
                   }
                   for(int v=0;v<n;v++){
                    b[i][v]=0;
                   }
                }
              
            }
        }
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        a[i][j]=b[i][j];
    }
}
    }
}