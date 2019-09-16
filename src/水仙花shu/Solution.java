package 水仙花shu;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> getNarcissisticNumbers(int n) {
        // write your code here

        int lo=(int) Math.pow(10,n-1);
        int hi=(int) Math.pow(10,n)-1;
        List<Integer> ls=new LinkedList<>();
        if (n==1){
            ls.add(0);
        }
        for (int i=lo;i<=hi ;i++ ){
            if (Isflower(i,n)){
                ls.add(i);
            }
        }
        return ls;
    }

    private boolean Isflower(int i,int n) {
        int sum=0;
        for (int j = 0; j <n ; j++) {
            int answer= (int) (i/Math.pow(10,j));
            int answe1=answer%10;
            sum+=Math.pow(answe1,n);
        }
        return sum==i?true:false;
    }
}
