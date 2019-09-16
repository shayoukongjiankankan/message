import java.util.ArrayList;
import java.util.HashMap;

public class Firstdou {
    public static void main(String[] args) {

    }
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 0; i <length ; i++) {
            if (map.containsKey(numbers[i])){
                map.put(numbers[i],map.get(numbers[i])+1);
            }else{
                map.put(numbers[i],1);
            }
            al.add(numbers[i]);
        }
        duplication[0]=-1;
//        for (int i = 0; i < length; i++) {
//            if (map.containsKey(i)){
//                if (map.get(i)!=1){
//                    duplication[0]=i;
//                }
//            }
//        }
        for (int index:al
             ) {
            if (map.get(index)!=1){
                duplication[0]=index;
            }
        }
        if (duplication[0]==-1){
            return false;
        }else{
            return true;
        }
    }
}

