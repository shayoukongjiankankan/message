import java.util.Scanner;

public class BuyHouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[][]array=new int[num][2];
        for (int i = 0; i <num ; i++) {
            array[i][0]=sc.nextInt();
            array[i][1]=sc.nextInt();
        }
        for (int i = 0; i <num ; i++) {
          int max=  ttl(Maxsion(array[i][0],array[i][1]));
          int min=  0;
            System.out.println(min+" "+max);
        }
    }

    private static int Maxsion(int m, int n) {
        if (n<2){
            return 0;
        }
        if (m>=2*n-1){
            return n-1;
        }else {
            return ttl(m-n);
        }

    }

    private static int ttl(int i) {
        if (i>=0){
            return i;
        }else {
            return 0;

        }
    }
}
