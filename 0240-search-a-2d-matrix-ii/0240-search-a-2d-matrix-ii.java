class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int j=0;
            while(j<matrix[i].length){
                if(matrix[i][j]==target){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}