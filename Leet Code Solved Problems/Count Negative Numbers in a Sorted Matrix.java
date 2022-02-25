// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

// Input: grid = [[3,2],[1,0]]
// Output: 0

class Solution {
    public int countNegatives(int[][] grid) {
        // int res=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j]<0) res++;
        //     }    
        // }
        // return res;
        
        int m = grid.length, n = grid[0].length, r = m - 1, c = 0, cnt = 0;
        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                --r;
                cnt += n - c; // there are n - c negative numbers in current row.
            }else {
                ++c;
            }
        }
        return cnt;
    }
}




// This solution uses the fact that the negative regions of the matrix will form a "staircase" shape, e.g.:

// ++++++
// ++++--
// ++++--
// +++---
// +-----
// +-----
// What this solution then does is to "trace" the outline of the staircase.