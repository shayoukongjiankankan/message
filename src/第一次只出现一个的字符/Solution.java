package 第一次只出现一个的字符;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String str="a";
        System.out.println(firstUniqChar(str));
    }
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public static boolean firstUniqChar(String str) {
        // Write your code here
        HashMap<Character,Integer>map=new HashMap<>();
        ArrayList<Character> al=new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i),1);
                al.add(str.charAt(i));
            }
        }
        char count = 0;
        for (char q:al) {
            if (map.get(q)!=1){
               count++;

            }
        }
        return count==0?true:false;
    }
}