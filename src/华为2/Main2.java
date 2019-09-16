package 华为2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int r=str.charAt(str.length()-1);
//        Stack<Character>stack=new Stack<>();
//        Stack<Character>stack1=new Stack<>();
        StringBuffer sb=new StringBuffer();

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='{'){
               while (str.charAt(i-1)!='}'){
                   sb.append(str.charAt(i));
                   i++;
               }
               sb.append('&');

            }
        }
        String sb2=sb.substring(0,sb.length()-1);

        String[]strarray=sb2.split("&");
        ArrayList<ArrayList<Integer>>all=new ArrayList<>();
        for (int i = 0; i <strarray.length ; i++) {
            ArrayList<Integer>al=new ArrayList<>();
            String str3=strarray[i].substring(1,strarray[i].length()-1);

            String[] strarray1=str3.split(",");
            for (int j = 0; j <strarray1.length ; j++) {
                al.add(Integer.parseInt(strarray1[j]));
            }
            all.add(al);
        }



    }


}
