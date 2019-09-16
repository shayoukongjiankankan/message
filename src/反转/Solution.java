package 反转;

public class Solution {
    public static void main(String[] args) {
        String s="  Life  doesn't  always    give     us  the       joys we want.";
        String answer=reverseWords(s);
        System.out.println(answer);
    }
    /*
     * @param s: A string
     * @return: A string
     */
    public static String reverseWords(String s) {
        if (s.length()==0){
            return "";
        }
        // write your code here
        String str=getStringBuffer(s);

        String []strarray=str.split(" +");


        StringBuffer sb1=new StringBuffer();
        for (int i = 0; i <strarray.length ; i++) {
            if (strarray[i]!=""){
                sb1.append(getStringBuffer(strarray[i]));
                sb1.append(" ");
            }
        }
        return sb1.toString();
    }

    private static String getStringBuffer(String s) {
        StringBuffer sb=new StringBuffer();
        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(s.charAt(i));
        }
        String answer=sb.toString();
        return answer;
    }
}
