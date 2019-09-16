package 华为2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if (str.length()==0){
            System.out.println(str);
        }else {
            ArrayList<String>al=new ArrayList<>();
            String[]strarray=str.split(" ");
            for (int i = 0; i <strarray.length ; i++) {
                if (strarray[i]!=null){
                    StringBuffer sb=new StringBuffer();
                    for (int j = 0; j <strarray[i].length() ; j++) {
                        if ((strarray[i].charAt(j)>='a'&&strarray[i].charAt(j)<='z')||
                                (strarray[i].charAt(j)>='A'&&strarray[i].charAt(j)<='Z')||
                                (strarray[i].charAt(j)>='0'&&strarray[i].charAt(j)<='9')){

                            sb.append(strarray[i].charAt(j));
                        }else if(j!=0&&j!=strarray[i].length()-1&&strarray[i].charAt(j)=='-'
                                &&strarray[i].charAt(j+1)!='-'){

                            sb.append(strarray[i].charAt(j));
                        }else if (j!=0&&j!=strarray[i].length()-1&&strarray[i].charAt(j)=='-'&&
                                strarray[i].charAt(j+1)=='-'){
                            al.add(sb.toString());
                            sb.delete(0,sb.length());
                            j=j+1;
                        }else {
                            al.add(sb.toString());
                            sb.delete(0,sb.length());
                        }

                    }
                    al.add(sb.toString());
                }
            }
            StringBuffer sb1=new StringBuffer();
            for (int i = al.size()-1; i >=0; i--) {

                if (al.get(i).length()!=0){
                    sb1.append(al.get(i)+" ");
                }
            }
            System.out.println(sb1.toString());
//            String str1=sb1.toString();
//            String str2=ReverseSentence(str1);
//            System.out.println(str2);
        }


    }

    public static String ReverseSentence(String str) {
        if(str==null||str.length()==0){
            return str;
        }

        String str1=Reverseogstring(str);
        String []strs=str1.split(" ");//注意是双引号
        if(strs.length==0){
            return str;
        }
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            sb.append(Reverseogstring(strs[i]));
            if(i!=strs.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
    private static String Reverseogstring(String str) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(str.length()-i-1));
        }
        return sb.toString();
    }
}
