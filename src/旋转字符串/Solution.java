package 旋转字符串;
public class Solution {
    public static void main(String[] args) {
        String str="abcdefg";
        char[]array=str.toCharArray();
        rotateString(array,3);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }
    }
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public static  void rotateString(char[] str, int offset) {
        // write your code here
        String str1=new String(str);
        System.out.println(str1);
        StringBuffer sb=new StringBuffer();
        for (int i = str1.length()-offset; i <str1.length() ; i++) {
            sb.append(str1.charAt(i));
        }
        for (int i = 0; i <str1.length()-offset ; i++) {
            sb.append(str1.charAt(i));
        }
        for (int i = 0; i <str.length ; i++) {
            str[i]=sb.charAt(i);
        }


    }
}