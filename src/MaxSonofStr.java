import java.util.Scanner;
//最大公共子字符串
public class MaxSonofStr {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str1=sc.nextLine();
//        String str2=sc.nextLine();
        String str1="aacdefcaa";
        String str2="aacfedcaa";
        int maxsonoflength=MaxsonofCommon(str1,str2);

        System.out.println(maxsonoflength+" "+MaxsonofCommon(str1,str2));
    }
    //循环
    private static int MaxsonofCommon(String str1, String str2) {
        char[] array1=str1.toCharArray();
        char[] array2=str2.toCharArray();
        int maxlength=0;
        int sonend=0;
        int [][]array=new int[array1.length][array2.length];
        for (int i = 0; i <str1.length() ; i++) {
            for (int j = 0; j <str2.length() ; j++) {
                if (array1[i]==array2[j]){
                    if (i>0&&j>0){
                        array[i][j]=array[i-1][j-1]+1;
                        System.out.println(23);
                    }else{
                        array[i][j]=1;
                    }

                }
//                maxlength=Math.max(maxlength,array[i][j]);
                if (array[i][j]>maxlength){
                    maxlength=array[i][j];
                    sonend=i;
                }

            }
        }
        StringBuffer sb=new StringBuffer();
        for (int i = sonend-maxlength+1; i <=sonend ; i++) {
            sb.append(str1.charAt(i));
        }
        System.out.println(sb.toString());
        return maxlength;
    }
    //递归
    public static int maxson(String str1,String str2){
        if(str1.length()==0||str2.length()==0){
            return  0;
        }
        int maxlength1=0;
        int indexofstr=0;
        for (int i = 0; i <str1.length() ; i++) {
            for (int j = 0; j <str2.length() ; j++) {
                int length1=0  ;
                length1=judgeCommen(str1,str2,i,j);
                    if(length1>maxlength1){
                        maxlength1=length1;
                        indexofstr=i;
                }
            }
        }
        StringBuffer sb=new StringBuffer();
        for (int i = indexofstr; i <indexofstr+maxlength1 ; i++) {
            sb.append(str1.charAt(i));
        }
        System.out.println(sb.toString());
        return maxlength1;
    }
    static int count=0;
    private static int judgeCommen(String str1, String str2, int i, int j) {
        if(i>=str1.length()||j>=str2.length()||str1.charAt(i)!=str2.charAt(j)){
            return 0;
        }
         count=judgeCommen(str1,str2,i+1,j+1)+1;
        return count;
    }

}
