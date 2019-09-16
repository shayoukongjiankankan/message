import java.util.Arrays;
import java.util.Collection;
public class Iscontinuous {
    public static void main(String[] args) {
        int []numbers={0,0,3,5,6};
        StringBuffer sb=new StringBuffer();
        sb.toString();
        System.out.println(isContinuous(numbers));
    }
    public static boolean isContinuous(int [] numbers) {
        if (numbers.length<5){
            return  false;
        }

        Arrays.sort(numbers);
        int numberofzero=0;
        int numberofgap=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]==0){
                numberofzero++;
            }
        }
        int lo=numberofzero;
        int hi=numberofzero+1;
        while(hi<numbers .length){
            if (numbers[lo]==numbers[hi]){
                return  false;
            }
            numberofgap+=numbers[hi]-numbers[lo]-1;
            lo=hi;
            hi++;
        }
        return numberofgap>numberofzero?false:true;
    }
}
