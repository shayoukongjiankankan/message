package 非排序数组找出两个数之和为target;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array={0,4,3,0};
        int target=0;
        int []answer=twoSum(array,target);
        for (int i = 0; i <answer.length ; i++) {
            System.out.println(answer);
        }
    }
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public static int[] twoSum(int[] numbers, int target) {
        // write your code here

        int[]array=numbers.clone();
        Arrays.sort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        int lo=0;
        int hi=array.length-1;
        int num1=-1;
        int num2=-1;
        int []answer=new int[2];
        while(lo<hi){
            if (array[lo]+array[hi]<target){
                lo++;
            }else if (array[lo]+array[hi]>target){
                hi--;
            }else {
                num1=lo;
                num2=hi;
                break;
            }
        }
        if (num1==-1){
            return null;
        }else{
            for (int i = 0; i <numbers.length ; i++) {
                if (numbers[i]==array[num1]){
                    answer[0]=i;
                }

            }
            for (int i = 0; i <numbers.length ; i++) {
                if (numbers[i]==array[num2]&&i!=answer[0]){
                    answer[1]=i;
                }
            }
            if (answer[0]>answer[1]){
                int temp=answer[0];
                answer[0]=answer[1];
                answer[1]=temp;
            }
            return answer;
        }

    }
}