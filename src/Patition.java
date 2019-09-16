import java.util.Scanner;

public class Patition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int []array=new int[num];
        for (int i = 0; i <num ; i++) {
            array[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i <num ; i++) {
            sum+=NumberOf1(array[i]);
            System.out.println(array[i]);
        }
        System.out.println(sum);
    }

    public static int NumberOf1(int n) {

        int count = 0;

        int i = 1;

        while(i != 0){

            if((n & i) != 0){

                count++;

            }

            i = i << 1;

        }

        return count;

    }

}
