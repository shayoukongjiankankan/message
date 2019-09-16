package 华为;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String[]strarray=new String[num];
        for (int i = 0; i < num; i++) {
            strarray[i]=sc.nextLine();

        }
        HashMap<String,Integer>map=new HashMap<>();


            String []Aut=strarray[strarray.length-1].split("=");
            String[]answer=Aut[1].split("//+");
            int length=answer.length;
            for (int j = 0; j <answer.length ; j++) {
                answer[j]=answer[j].replaceAll("^[\\s\\u3000]{1,}([^\\s\\u3000].*[^\\s\\u3000])[\\s\\u3000]{1,}$", "$1");
                try {
                 int num1=   Integer.parseInt(answer[j]);
                 map.put(answer[j],num1);
                }catch (Exception e){
                    map.put(answer[j],-10086);
                }
            }
            decide(map,strarray,strarray.length-2);



    }

    private static void decide(HashMap<String, Integer> map, String[] strarray, int i) {
        if (i<0){
            return;
        }
        String []Aut=strarray[i].split("=");
        String []Autleft=Aut[0].split("//+");
        String []Autright=Aut[1].split("//+");
        for (int j = 0; j <Autleft.length ; j++) {
            Autleft[j]=Autleft[j].replaceAll("^[\\s\\u3000]{1,}([^\\s\\u3000].*[^\\s\\u3000])[\\s\\u3000]{1,}$", "$1");
            try {
                int num1=   Integer.parseInt(Autleft[j]);
                map.put(Autleft[j],num1);
            }catch (Exception e){
                map.put(Autleft[j],-10086);
            }
        }


    }
}
