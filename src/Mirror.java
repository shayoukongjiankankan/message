import java .util.Scanner;
public class Mirror {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        if (str.length()==1){
            System.out.println(str.charAt(0));
        }
        char [] strarray=str.toCharArray();
        char [] strarrayreverg=new char[strarray.length];
        for (int i = 0; i <strarray.length ; i++) {
            strarrayreverg[i]=strarray[strarray.length-i-1];

        }


        String answer=maxsonofcommom(strarray,strarrayreverg);
        System.out.println(answer);
    }

    private static String maxsonofcommom(char[] array1, char[] array2) {
       int maxlength=0;

       int[][]array=new int[array1.length][array2.length];

       int index=-1;
        for (int i = 0; i <array1.length ; i++) {
            int length=0;
            for (int j = 0; j <array2.length ; j++) {
                if (array1[i]==array2[j]){
                    if (i>0&&j>0){
                        array[i][j]=array[i-1][j-1]+1;
                    }else{
                        array[i][j]=1;
                    }

                }
                if (array[i][j]>maxlength){
                    maxlength=array[i][j];
                    index=i;
                }
            }

        }
        StringBuffer sb=new StringBuffer();
        for (int i = index-maxlength+1; i <=index ; i++) {
            sb.append(array1[i]);
        }
//        System.out.println(maxlength);
        return sb.toString();

    }
}
