import java.util.Scanner;
//障碍物不能放灯的解法
public class Roadlight {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//int count=0;
//        int[]length=new  int[num];
//        String[]strarray=new String[num];
//        int k=0;
//
//        for (int i = 0; i <num*2 ; i++) {
//            if (i%2==0){
//                length[i/2]=sc.nextInt();
//            }
//            if (i%2==1){
//               strarray[k]=sc.next();
//               k++;
//
//            }
//
//        }
//
//        for (int i = 0; i <strarray.length ; i++) {
//            String[]strarrays=strarray[i].split("X");
//            int sum=0;
//            for (int j = 0; j <strarrays.length ; j++) {
//                if (strarrays[j].length()==0){
//                    sum+=0;
//                }else if(strarrays[j].length()<=3){
//                    sum+=1;
//                }else {
//                    if (strarrays[j].length()%3==0){
//                        sum+=strarrays[j].length()/3;
//                    }else {
//                        sum+=strarrays[j].length()/3+1;
//                    }
//                }
//
//            }
//
//
//            System.out.println(sum);
//        }
//    }
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int[]length=new  int[num];
        String[]strarray=new String[num];
        int k=0;

        for (int i = 0; i <num*2 ; i++) {
            if (i%2==0){
                length[i/2]=sc.nextInt();
            }
            if (i%2==1){
               strarray[k]=sc.next();
               k++;

            }

        }
    for (int i = 0; i <strarray.length ; i++) {
        int count0=0;
        for (int j = 0; j <strarray[i].length() ; j++) {
            if (strarray[i].charAt(j)=='.'){
                count0++;
                j+=2;
            }
        }
        System.out.println(count0);
    }
}
}
