import java.util.Scanner;

//public class Work {
//    public static void main(String []args){
//        Scanner sc=new Scanner(System.in);
//        int worknum=sc.nextInt();
//        int friendnum=sc.nextInt();
//        long[][]array1=new long[worknum][2];
//        for (int i = 0; i <worknum ; i++) {
//            array1[i][0]=sc.nextInt();
//            array1[i][1]=sc.nextInt();
//        }
//        long[]ability=new long[friendnum];
//        for (int i = 0; i <friendnum ; i++) {
//            ability[i]=sc.nextInt();
//        }
//        for (int i = 0; i <friendnum ; i++) {
//            long maxsalary=0;
//            for (int j = 0; j <worknum ; j++) {
//                if (ability[i]>=array1[j][0]){
//                    if (maxsalary<array1[j][1]){
//                        maxsalary=array1[j][1];
//                    }
//                }
//            }
//
//            if (i!=friendnum-1){
//                System.out.print(maxsalary);
//                System.out.println();
//            }else{
//                System.out.print(maxsalary);
//            }
//        }
//
//    }
//}
import java.util.*;
public class Work{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t1=0,t2=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        int[] a = new int[n+m];
        int[] b = new int[m];
        for(int i=0;i<n;i++){
            t1 = sc.nextInt();
            t2 = sc.nextInt();
            a[i] = t1;
            hs.put(t1,t2);
        }
        for(int i=0;i<m;i++){
            t1 = sc.nextInt();
            a[n+i] = t1;
            b[i] = t1;
            if(!hs.containsKey(t1))
                hs.put(t1,0);
        }
        Arrays.sort(a);//排序让能力从小到大排序这时候从下到上max一定符合要求的
        int max = 0;
        for(int i=0;i<m+n;i++){
            max = Math.max(max,hs.get(a[i]));//max从下向上依次传递，满足他能力的max依次向上比较传递
            hs.put(a[i],max);
        }
        for(int i=0;i<m;i++){
            System.out.println(hs.get(b[i]));
        }
    }
}
