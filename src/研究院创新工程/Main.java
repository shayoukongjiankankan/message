package 研究院创新工程;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void blackList(ArrayList<String> a,ArrayList<String>b ){
        HashMap<String,Integer>map=new HashMap<>();
        for (int i = 0; i <b.size() ; i++) {
            map.put(b.get(i),1);
        }
        for (int i = 0; i <a.size() ; i++) {
            if (map.containsKey(a.get(i))){
                a.remove(i);
            }
        }

    }
}
