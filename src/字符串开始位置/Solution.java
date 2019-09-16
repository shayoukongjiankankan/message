package 字符串开始位置;
public class Solution {
    public static void main(String[] args) {
        String str1="mississippi";
        String str2="issip";
        System.out.println(strStr(str1,str2));
    }


    /**
     * @param source:
     * @param target:
     * @return: return the index
     */
    public static int strStr(String source, String target) {
        // Write your code here
        if (target.length()>source.length()){
            return -1;
        }
        if (target.length()==source.length()&&target.length()==0){
            return 0;
        }
        if(target.length()==0){
            return 0;
        }


        int index=-1;
        for (int i = 0; i <source.length() ; i++) {
            if (source.charAt(i)==target.charAt(0)){

                boolean []flag=new boolean[source.length()];
                if(DFS1(source,target,i,0,flag)){
                    index=i;
                    break;
                }
            }

        }
        return index;
    }

    private static boolean DFS1(String source, String target, int i, int i1, boolean[] flag) {
        if (i<0||i1<0||i>source.length()-1||i1>target.length()-1||flag[i]==true||source.charAt(i)!=target.charAt(i1)){
            return false;
        }
        flag[i]=true;
        if (i1==target.length()-1){
            return true;
        }
        return DFS1(source,target,i+1,i1+1,flag);
    }
}