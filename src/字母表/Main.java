package 字母表;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[]array={"cat","bt","hat","tree"};
        String str="atach";
        Main main=new Main();
        System.out.println(main.countCharacters(array,str));

    }
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer>map=new HashMap<>();
        ArrayList<Character> al=new ArrayList<>();
        for (int i = 0; i <chars.length() ; i++) {
            if (map.containsKey(chars.charAt(i))){
                map.put(chars.charAt(i),map.get(chars.charAt(i))+1);
            }else {
                map.put(chars.charAt(i),1);
                al.add(chars.charAt(i));
            }
        }
        int sum=0;

        for (int i = 0; i <words.length ; i++) {
            if (match(al,map,words[i])){
                sum+=words[i].length();
            }
        }
        return sum;
    }

    private boolean match(ArrayList<Character> al, HashMap<Character, Integer> map, String word) {
       HashMap<Character,Integer>newmap= (HashMap<Character, Integer>) map.clone();
        for (int i = 0; i <word.length() ; i++) {
            if (newmap.containsKey(word.charAt(i))&&newmap.get(word.charAt(i))!=0){
                newmap.put(word.charAt(i),newmap.get(word.charAt(i))-1);
            }else {
                return false;
            }
        }
        return true;
    }
}
