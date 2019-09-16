import java.util.Scanner;

public class Road {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        if (num<=2){
//            System.out.println(2);
//        }else{
//            System.out.println((num/2+2)%1000000007);
//        }
        int num=sc.nextInt();
        int []array=new int[num];
        for (int i = 0; i <num ; i++) {
            array[i]=sc.nextInt();
        }


        int maxlength=0;
        for (int i = 0; i <array.length ; i++) {
            boolean []flag=new boolean[array.length];
           int leng= Maxcount(i,0,array,flag);
            if (leng>maxlength){
                maxlength=leng;
            }
        }
        System.out.println(maxlength);
    }

    private static int Maxcount(int i, int j, int[] array, boolean[] flag) {

//        if (i==j){
//            flag[j]=true;
//        }

        if (i>=array.length||j>=array.length||i<0||j<0||flag[j]==true||!Commen(array[i],array[j])){
            return 0;
        }

        flag[j]=true;
//        System.out.println(j);
        return 1+Maxcount(i,j+1,array,flag)+Maxcount(i,j-1,array,flag);








    }

    private static boolean Commen(int n1, int n2) {
        int x=n1;
        int y=n2;
        if(x<y){//x,y互换
            int z=x;
            x=y;
            y=z;
        }
        int i=x%y;
        while(i!=0){
            x=y;
            y=i;
            i=x%y;
        }
        if (y!=1){
            return true;
        }else {
            return false;
        }
    }

}
