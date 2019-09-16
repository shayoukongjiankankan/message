import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
//        int [] number=new int[num];
        char []numa=new char[num];
        char [] fh=new char[num-1];
        String str=sc.nextLine();
        String[]strarray=str.split(" ");
        for (int i = 0; i <strarray.length ; i++) {
            System.out.println(strarray[i]);
        }
        for (int i = 0; i <strarray.length ; i++) {
            if (i%2==0){
                numa[i/2]=strarray[i].charAt(1);
            }else{
                fh[i/2]=strarray[i].charAt(1);
            }
        }
        for (int i = 0; i <num ; i++) {
            System.out.println(numa[i]);
        }
        for (int i = 0; i <num-1 ; i++) {
            System.out.println(fh[i]);
        }
    }


}
