package 搜狗;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int num=sc.nextInt();
        HashMap<Integer, ArrayList>map=new HashMap<>();
        ArrayList<Integer>al1=new ArrayList<>();
        for (int i = 0; i <num ; i++) {
            int n=sc.nextInt();
            ArrayList<Integer>al=new ArrayList<>();

            for (int j = 0; j < n; j++) {



                    al.add(sc.nextInt());


            }
            map.put(i,al);
            al1.add(i);
        }
        int times=0;
        boolean[]flag=new boolean[al1.size()];
        boolean flag1=true;
        while(flag1){
            for (int i:
                 al1) {
                if (times>=i&&map.get(i).size()-1<=k*(times-i)){

                    flag[i]=true;
                }
                if (decide(flag)){
                    flag1=false;
                }
            }
            times++;
        }
        System.out.println(times-1);

    }

    private static boolean decide(boolean[] flag) {
        boolean answer=flag[0];
        for (int i = 0; i <flag.length ; i++) {
            answer=answer&&flag[i];
        }
        return answer;
    }
}
