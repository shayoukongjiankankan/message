import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] number=new int[num];
        char[] fh=new char[num-1];
        for (int i = 0; i <2*num-1 ; i++) {
            if (i%2==0){
                number[i/2]=Integer.parseInt(sc.next());
            }else{
                fh[i/2]=sc.next().charAt(0);
            }
        }
        for (int i = 0; i <number.length ; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
        for (int j = 0; j <num ; j++) {
            for (int i =0; i <num-1 ; i++) {
                if (number[i]>number[i+1]){

                    if (i!=0&&i!=number.length-2){
                        if ((fh[i-1]=='+'||fh[i-1]=='-')&&(fh[i]=='+'||fh[i]=='-')&&(fh[i+1]=='+'||fh[i+1]=='-')){
                            swap(number,i,i+1);
                        }else if ((fh[i]=='*'||fh[i]=='/')){
                            swap(number,i,i+1);
                        }
                    }else if (i==0){
                        if ((fh[i]=='+'||fh[i]=='-')&&(fh[i+1]!='*'||fh[i+1]!='/')){
                            swap(number,i,i+1);

                        }else if((fh[i]=='*'||fh[i]=='/')) {
                            swap(number,i,i+1);
                        }
                    }

                    else {
                        if ((fh[i]=='+'||fh[i]=='-')&&(fh[i-1]!='*'||fh[i-1]!='/')){
                            swap(number,i,i+1);

                        }else if((fh[i]=='*'||fh[i]=='/')) {
                            swap(number,i,i+1);
                        }
                    }

                }

            }


        }

        for (int i = 0; i <2*num -1; i++) {
            if (i%2==0){
                System.out.print(number[i/2]+" ");
            }else{
                System.out.print(fh[i/2]+ " ");
            }
        }
    }
    private static void swap(int[] array, int lo, int hi) {
        if (lo!=hi){
            int temp=array[lo];
            array[lo]=array[hi];
            array[hi]=temp;
        }
    }

}
//import java.util.Scanner;
//
//public class Main1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] number = new int[num];
//        char[] fh = new char[num - 1];
//        for (int i = 0; i < 2 * num - 1; i++) {
//            if (i % 2 == 0) {
//                number[i / 2] = Integer.parseInt(sc.next());
//            } else {
//                fh[i / 2] = sc.next().charAt(0);
//            }
//        }
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < num - 1; i++) {
//            if (number[i] > number[i + 1]) {
//                if (i != 0 && i != number.length - 2) {
//                    if ((fh[i - 1] == '+' || fh[i - 1] == '-') && (fh[i] == '+' || fh[i] == '-') && (fh[i + 1] == '+' || fh[i + 1] == '-')) {
//                        swap(number, i, i + 1);
//                    } else if ((fh[i] == '*' || fh[i] == '/')) {
//                        swap(number, i, i + 1);
//                    }
//                } else if (i == 0) {
//                    if ((fh[i] == '+' || fh[i] == '-') && (fh[i + 1] != '*' || fh[i + 1] != '/')) {
//                        swap(number, i, i + 1);
//
//                    } else if ((fh[i] == '*' || fh[i] == '/')) {
//                        swap(number, i, i + 1);
//                    }
//                } else {
//                    if ((fh[i] == '+' || fh[i] == '-') && (fh[i - 1] != '*' || fh[i - 1] != '/')) {
//                        swap(number, i, i + 1);
//
//                    } else if ((fh[i] == '*' || fh[i] == '/')) {
//                        swap(number, i, i + 1);
//                    }
//                }
//
//            }
//
//        }
//
//        for (int i = 0; i < num; i++) {
//            System.out.print(number[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 2 * num - 1; i++) {
//            if (i % 2 == 0) {
//                System.out.print(number[i / 2] + " ");
//            } else {
//                System.out.print(fh[i / 2] + " ");
//            }
//        }
//    }
//    private static void swap(int[] array, int lo, int hi) {
//        if (lo!=hi){
//            int temp=array[lo];
//            array[lo]=array[hi];
//            array[hi]=temp;
//        }
//    }
//}