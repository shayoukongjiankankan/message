package 动态规划.最小路径和;

public class Solution {
    public static void main(String[] args) {
//        int [][]grid={{1,3,1},{1,5,1},{4,2,1}};
//        Solution solution=new Solution();
//
//        System.out.println(solution.minPathSum(grid));
    }
    /**
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here

        int len=grid.length;
        int len1=grid[0].length;
        int [][]roadofmin=new int[len][len1];


        System.out.println(grid[0][0]);
        for (int i = 0; i <roadofmin.length; i++) {
            for (int j = 0; j <roadofmin[0].length ; j++) {
                if (i>0&&j>0){
                    roadofmin[i][j]=Math.min(roadofmin[i-1][j],roadofmin[i][j-1])+grid[i][j];
                }else if (i==0&&j>0){
                    roadofmin[i][j]=roadofmin[i][j-1]+grid[i][j];
                }else if (j==0&&i>0){
                    roadofmin[i][j]=roadofmin[i-1][j]+grid[i][j];
                }else {
                    roadofmin[i][j]=grid[i][j];
                }

            }
        }
        return roadofmin[roadofmin.length-1][roadofmin[0].length-1];
    }
}