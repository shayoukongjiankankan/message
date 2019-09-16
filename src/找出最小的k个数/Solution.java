package 找出最小的k个数;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Solution Method=new Solution();
        int[]array={123,5,9,8,6,2,6,4,5,2,6,5};
        ArrayList al=Method.GetLeastNumbers_Solution(array,4);
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));
        }
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>al=new ArrayList<>();
        if(k==0){
            return al;
        }
        if(input.length<k){
            return al;
        }
        int lo=0;
        int hi=input.length-1;
        int index=patition(input,lo,hi);

        while(index!=k-1){
            if(index<k-1){
              index=  patition(input,index+1,hi);
            }
            if(index>k-1){
                index=patition(input,lo,index-1);
            }
        }
        for(int i=0;i<k;i++){
            al.add(input[i]);
        }
        return al;
    }
    public int patition(int []input,int lo,int hi){
        if(lo>=hi){
            return 0;
        }
        int index=input[lo];
        while(lo<hi){
            while(lo<hi&&input[hi]>=index){//算法规则，找出右边比它小的，等于不属于，所以这里一定要加等于
                hi--;
            }
            swap(input,lo,hi);
            while(lo<hi&&input[lo]<=index){
                lo++;
            }
            swap(input,lo,hi);
        }
        return lo;
    }
    public void swap(int []array,int lo,int hi){
        if(array[lo]!=array[hi]){
            int temp=array[hi];
            array[hi]=array[lo];
            array[lo]=temp;
        }
    }
}