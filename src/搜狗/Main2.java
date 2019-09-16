package 搜狗;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Main2 main=new Main2(size);
        while (sc.hasNext()){
            main.put(sc.next(),sc.nextInt());
        }
    }
    private LinkedHashMap<String,Integer>mMap;
    private  int cacheSize;
    public Main2(int size){
        this.cacheSize=size;
        mMap=new LinkedHashMap<String, Integer>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                if (size()>cacheSize){
                    System.out.println(eldest.getKey()+" "+eldest.getValue());
                    return true;
                }else {
                    return false;
                }
            }
        };
    }
   public void put(String key,int value){
        if (mMap.containsKey(key)){
            int last=mMap.get(key);
            if (last<value){
                mMap.put(key,value);
            }
        }else {
            mMap.put(key,value);
        }

   }

}
