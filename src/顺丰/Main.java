package 顺丰;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] strarray=str.split(":");
        char [] shi=strarray[0].toCharArray();
        char [] fen=strarray[1].toCharArray();
        int [] numshi=new int[shi.length];
        int [] numfen=new int[fen.length];
        int max=0;
        int index1=0;
        int index2=0;
        Main main=new Main();
        for (int i = 0; i <shi.length ; i++) {
            numshi[shi.length-i-1]=main.tobrNumber(shi[i]);
            index1+=numshi[shi.length-i-1];
            if (numshi[shi.length-i-1]>max){
                max=numshi[shi.length-i-1];
            }
        }

        for (int i = 0; i <fen.length ; i++) {
            numfen[fen.length-i-1]=main.tobrNumber(fen[i]);
            index2+=numfen[fen.length-i-1];
            if (numfen[fen.length-i-1]>max){
                max=numfen[fen.length-i-1];
            }
        }
//        System.out.println(numshi.length);
//        System.out.println(numfen.length);
        if ((index1<=1&&index2<=1)){
            System.out.print(0);
        }else {
            boolean flag=true;
            int num=max+1;
            int maxshi1=0;
            int maxfen1=0;
            for (int i = 0; i <numshi.length ; i++) {
                maxshi1+=numshi[i]*Math.pow(num,i);
            }
            for (int i = 0; i <numfen.length ; i++) {
                maxfen1+=numfen[i]*Math.pow(num,i);
            }
            if (maxshi1>=24||maxfen1>=60){
                System.out.print(-1);
            }
            while (flag){
                int maxshi=0;
                int maxfen=0;
                for (int i = 0; i <numshi.length ; i++) {
                    maxshi+=numshi[i]*Math.pow(num,i);
                }
                for (int i = 0; i <numfen.length ; i++) {
                    maxfen+=numfen[i]*Math.pow(num,i);
                }

                if (maxshi<24&&maxfen<60){
                    System.out.print(num+" ");
                    num++;
                }else {
                    flag=false;
                }
            }
        }
    }
    private  int tobrNumber(char c) {
        if (c>='0'&&c<='9'){
            String ch=String.valueOf(c);
            return Integer.parseInt(ch);
        }else if (c>='A'&&c<='Z'){
            int count=10;
            for (char chh = 'A'; chh<c ; chh++) {
                count++;
            }

            return count;
        }
        return -1;
    }
}
