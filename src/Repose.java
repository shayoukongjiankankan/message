import java.util.Arrays;
import java.util.Scanner;

public class Repose {
//    public static void main(String []args){
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        String []str1=str.split(" ");
//        int []array=new int[str1.length];
//        for (int i = 0; i <str1.length ; i++) {
//            array[i]=Integer.parseInt(str1[i]);
//        }
//        Arrays.sort(array);
//        int sum=0;
//        for (int i = array.length-1; i >0; i--) {
//            sum+=(array[i]-array[i-1]);
//        }
//        System.out.println(sum);
//    }
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int x=sc.nextInt();
//    int num=x/5;
//    if (x<5){
//        System.out.println(1);
//    }else{
//        if (x%5==0){
//            System.out.println(num);
//        }else{
//            System.out.println(num+1);
//        }
//
//    }
//}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int[][]array=new int[num][2];
    for (int i = 0; i <num ; i++) {
        array[i][0]=sc.nextInt();
        array[i][1]=sc.nextInt();
    }
    for (int i = 0; i <array.length ; i++) {
        if (array[i][0]>1&&array[i][1]>1){
            System.out.println(ttl(array[i][0]*array[i][1]-2*(array[i][0]+array[i][1])+2));
        }else{
            if(array[i][0]==1&&array[i][1]==1){
                System.out.println(1);
            }else {
                System.out.println(ttl(array[i][0]*array[i][1]-2));
            }

        }
    }
}

    private static int ttl(int i) {
        if (i>=0){
            return i;
        }else{
            return  0;
        }
    }
}
