import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Maxup {
    public static void main(String[] args) {
        int[]array={2,2,2};
        System.out.println(max1(array));
    }

    public static int max1(int []array){
        if (array.length<=1){
            return array.length;
        }
        int[]array1=array.clone();
        Arrays.sort(array1);
        HashMap<Integer,Integer>map=new HashMap<>();

        ArrayList<Integer>al=new ArrayList<>();
        for (int i=0;i<array1.length;i++){
            if (map.containsKey(array1[i])){
                map.put(array1[i],map.get(array1[i]+1));
            }else{
                map.put(array1[i],1);
                al.add(array1[i]);
            }
        }
        int []array3=new int[al.size()];
        for (int i = 0; i <al.size() ; i++) {
            array3[i]=al.get(i);
        }

        return Masonofstr(array, array3);

    }

    public static int Masonofstr(int[] array, int[] array1) {
        int[][]array2=new int[array.length+1][array1.length+1];
        for (int i = 0; i <=array.length ; i++) {
            array2[i][0]=0;
        }
        for (int i = 0; i <=array1.length ; i++) {
            array2[0][i]=0;
        }
        int maxlength=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array1.length ; j++) {
                if (array[i]==array1[j]){

                    array2[i+1][j+1]=array2[i][j]+1;

                }else {

                    array2[i+1][j+1]=Math.max(array2[i+1][j],Math.max(array2[i][j+1],array2[i][j]));


                }

            }

        }
        return array2[array.length][array1.length];
    }

}
