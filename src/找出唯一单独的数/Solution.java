package 找出唯一单独的数;

public class Solution {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        int num=0;
        for (int i = 0; i < A.length; i++) {
            num^=A[i];
        }
        return num;
    }
}
