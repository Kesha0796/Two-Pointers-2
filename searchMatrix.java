class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Here s is row and f is column, initially pointers are pointing at top right corner of matrix
        if(matrix.length==0 || matrix==null)
            return false;
        int m=matrix.length,n=matrix[0].length;
        int s=0,f=n-1;
        while(s<m && f>=0)
        {
            if(matrix[s][f]==target)
                return true;
            else if(matrix[s][f]>target)
                f--;
            else
                s++;
        }
        return false;
    }
}

// Time Complexity: O(n) ---> Only 1 Loop
// Space Complexity: O(1) ---> No extra auxillary space used