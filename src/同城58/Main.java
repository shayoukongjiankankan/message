package 同城58;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int []array=new int[num];
        for (int i = 0; i <num ; i++) {
            array[i]=sc.nextInt();
        }
        candy( array);
    }

    private static int  candy( int[] array) {
        int sum=0;
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            if (i==0){
                if (array[i]<array[i+1]){

                    al1.add(i);
                }else if (array[i]>array[i+1]){
                    al2.add(i);
                }
            } else if (i==array.length-1){
                 if (array[array.length-1]>array[array.length-2]){

                    al2.add(array.length-1);
                }if (array[array.length-1]<array[array.length-2]){
                    al1.add(array.length-1);
                }
            }else {
                if (array[i] < array[i + 1] && array[i] < array[i - 1]) {
                    al1.add(i);
                }
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    al2.add(i);
                }
            }
        }
        System.out.println(al1.size());
        System.out.println(al1.get(0)+" "+al2.get(0));
        if (al1.get(0)<al2.get(0)){
            int start=1;
            int t=0;
            boolean flag=false;
            while (!flag){
                for (int i = 0; i <al2.get(t)-al1.get(t) ; i++) {
                    sum+=start;
                    start++;
                }
                for (int i = 0; i <al1.get(t+1)-al2.get(t) ; i++) {
                    sum+=start;
                    start--;
                }
                t++;
                if (al1.size()==al2.size()){
                    if (t==al1.size()){
                        for (int i = 0; i <al2.get(t)-al1.get(t) ; i++) {
                            sum+=start;
                            start++;
                        }
                        flag=true;
                    }
                }else if (al1.size()>al2.size()){
                    if (t==al2.size()-1){
                        for (int i = 0; i <al2.get(t)-al1.get(t) ; i++) {
                            sum+=start;
                            start++;
                        }
                        for (int i = 0; i <al1.get(t+1)-al2.get(t) ; i++) {
                            sum+=start;
                            start--;
                        }
                        flag=true;
                    }
                }

        }
     }else if (al1.get(0)>al2.get(0)){
            int start=al1.get(0)-al2.get(0);
            int t=0;
            boolean flag=false;
            while (!flag){
                for (int i = 0; i <al1.get(t)-al2.get(t) ; i++) {
                    sum+=start;
                    start--;
                }
                for (int i = 0; i <al2.get(t+1)-al1.get(t) ; i++) {
                    sum+=start;
                    start++;
                }
                t++;
                if (al1.size()==al2.size()){
                    if (t==al1.size()){
                        for (int i = 0; i <al1.get(t)-al2.get(t) ; i++) {
                            sum+=start;
                            start--;
                        }
                        flag=true;
                    }
                }else if (al1.size()<al2.size()){
                    if (t==al1.size()-1){
                        for (int i = 0; i <al1.get(t)-al2.get(t) ; i++) {
                            sum+=start;
                            start--;
                        }
                        for (int i = 0; i <al2.get(t+1)-al1.get(t) ; i++) {
                            sum+=start;
                            start++;
                        }
                        flag=true;
                    }
                }

            }
        }
        return sum;
    }


}
