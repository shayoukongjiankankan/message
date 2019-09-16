public class SumofMax {
    public static void main(String[] args){
        int []array={-1,-2,-3,-4,5,6,7,8,9,-100};
        System.out.println(sumofMax(array));
    }
    public static int sumofMax(int []array){
        if (array.length==0){
            return 0;
        }
        if (array.length==1){
            return array[0];
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
