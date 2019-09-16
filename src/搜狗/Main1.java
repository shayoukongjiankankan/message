package 搜狗;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>map=new HashMap<>();
        int n=sc.nextInt();
        HashMap<Integer,String>map1=new HashMap<>();
        ArrayList<String>all=new ArrayList<>();
        ArrayList<Integer>al=new ArrayList<>();
        int sum=0;
        while(sc.hasNext()){
            String str=sc.next();
            int num=sc.nextInt();
            if (map.containsKey(str)){
                map.put(str,num);
                for (int i:
                     al) {
                    if (map1.get(i).equals(str)){
                        map1.remove(i);
                    }
                }
                map1.put(sum,str);
                sum++;
                all.add(str);
                al.add(sum);

            }else {
                map.put(str,num);
                map1.put(sum,str);
                al.add(sum);
                sum++;
                if (sum==n){
                    int cha=sum-n;
                    System.out.println();
                    String str1=map1.get(cha);
                    System.out.print(str1+" ");
                    System.out.println(map.get(str1));
                }else if (sum>n){
                    int cha=sum-n;
                    int i=0;
                    int answer=0;
                    while(i<cha){
                        for (int j:
                             al) {
                            if (map1.containsKey(j)){
                                i++;
                            }
                            answer=j;
                        }
                        String str1=map1.get(answer);
                        System.out.print(str1+" ");
                        System.out.println(map.get(str1));
                        for (String str2:
                             all) {
                            if (str2==str1){
                                map.remove(str2);
                            }
                        }

                    }

                }
            }

        }
    }
}
