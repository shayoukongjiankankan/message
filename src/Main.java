import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int couple=8;
//        int num=sc.nextInt();
//        int couple=sc.nextInt();
//        int[][]array=new int[2][couple];
//        for (int i = 0; i <8 ; i++) {
//            array[0][i]=sc.nextInt();
//            array[1][i]=sc.nextInt();
//        }
       // {{1,5},{2,5},{3,5},{4,5},{1,6},{1,7},{1,8},{2,6}}
        int[][]array={{1,2,3,4,1,1,1,2},{5,5,5,5,6,7,8,6}};
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 0; i <array[0].length ; i++) {
            if (map.containsKey(array[0][i])){
                map.put(array[0][i],map.get(array[0][i])+1);
            }else{
                map.put(array[0][i],1);
                al.add(array[0][i]);
            }
            if (map.containsKey(array[1][i])){
                map.put(array[1][i],map.get(array[1][i])+1);
            }else{
                map.put(array[1][i],1);
                al.add(array[1][i]);
            }
//            System.out.print(array[0][i]);
//            System.out.println(array[1][i]);


        }
//        for (int i = 0; i <al.size() ; i++) {
//            System.out.println(al.get(i));
//        }

        int []array1=new int[al.size()];
        for (int i = 0; i <al.size() ; i++) {
            array1[i]=map.get(al.get(i));
            System.out.println(al.get(i));
        }

        Arrays.sort(array1);
        int sum=0;
        int count=0;
        ArrayList<Integer>all=new ArrayList<>();
        for (int i = array1.length-1; i >=0 ; i--) {
            System.out.println(array1[i]);
            sum+=array1[i];
            all.add(array1[i]);
            count++;
            if (sum>=couple){
                break;
            }
        }


//        System.out.println(count);
        for (int i = 0; i <all.size() ; i++) {
            int keyval=0;

            for (int j = 0; j <al.size() ; j++) {
                if (map.get(al.get(j)).equals(all.get(i))){

                    if (al.get(j)>keyval){
                        keyval=al.get(j);

                    }

                }
            }

            System.out.print(keyval+" ");
        }



    }

}
