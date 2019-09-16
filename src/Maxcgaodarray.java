import java.util.Arrays;

//买入一定在卖出前面
public class Maxcgaodarray {
    public static void main(String[] args) {
        int []array={9,11,8,5,7,12,16,14};
        System.out.println(Maxchaofarray(array));
//        int[][]array1=new int[3][4];

    }
    public static int Maxchaofarray(int []array){
        if (array.length<2){
            return -1;
        }
            int min=array[0];
        int maxdiff=array[1]-min;
        for(int i=2;i<array.length;i++){
            if (array[i-1]<min){
                min=array[i];
            }
            if(maxdiff<array[i]-min){
                maxdiff=array[i]-min;
            }
        }
        return maxdiff;
    }
}
