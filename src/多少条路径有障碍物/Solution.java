package 多少条路径有障碍物;

public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        int[][]numofroad=new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i <numofroad.length ; i++) {
            for (int j = 0; j <numofroad[0].length ; j++) {
                if (i!=0&&j!=0){
                    if (obstacleGrid[i][j]==0){
                        numofroad[i][j]=numofroad[i-1][j]+numofroad[i][j-1];
                    }else {
                        numofroad[i][j]=0;
                    }

                }else if (i==0&&j>0){
                    if (obstacleGrid[i][j]==0){
                        numofroad[i][j]=numofroad[i][j-1];
                    }else {
                        numofroad[i][j]=0;
                    }

                }else if (i>0&&j==0){
                    if (obstacleGrid[i][j]==0){
                        numofroad[i][j]=numofroad[i-1][j];
                    }else {
                        numofroad[i][j]=0;
                    }

                }else {
                    if (obstacleGrid[i][j]==0){
                        numofroad[i][j]=numofroad[i][j];
                    }else {
                        numofroad[i][j]=0;
                    }

                }
            }
        }
        return numofroad[numofroad.length-1][numofroad[0].length-1];
    }
}