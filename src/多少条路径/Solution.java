package 多少条路径;

public class Solution {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here
        int [][]numofroad=new int[m][n];
        for (int i = 0; i <numofroad.length ; i++) {
            for (int j = 0; j <numofroad[0].length ; j++) {
                if (i!=0&&j!=0){
                    numofroad[i][j]=numofroad[i-1][j]+numofroad[i][j-1];
                }else if (i==0&&j>0){
                    numofroad[i][j]=numofroad[i][j-1];
                }else if (i>0&&j==0){
                    numofroad[i][j]=numofroad[i-1][j];
                }else {
                    numofroad[i][j]=numofroad[i][j];
                }
            }
        }
        return numofroad[m-1][n-1];
    }
}