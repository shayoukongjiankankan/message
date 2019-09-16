

public class Tesrt {
    public static void main(String[] args) {
        int a=9;
        System.out.println(a);
        int []array={3,5,2,3,5,6,7,8,1,3,5,6,34,54,33,12,3};
        int hi=array.length-1;
        int lo=0;
        String str="ewqeqwhekjhlkhjealibabaeiwuqei";
        String str1="whegdfd";
        int num=Findofstring(str,str1);
        System.out.println(num);
//        quicksort(array,lo,hi);
//        for (int i = 0; i <array.length ; i++) {
//            System.out.print(array[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i <100 ; i++) {
//            int num1=(int)(0+Math.random()*(array.length));
//            int num2=(int)(0+Math.random()*(array.length));
//            if(num1!=num2){
//                swap(array,num1,num2);
//            }
//
//        }
//        for (int i = 0; i <array.length ; i++) {
//            System.out.print(array[i]+" ");
//        }
    }
    public static int[] sort(int[] array){

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
    public static void quicksort(int []array,int lo,int hi){
        if(lo>hi){
            return ;
        }
        if(array.length==0){
            return ;
        }
        int index=partion(array,lo,hi);
        quicksort(array,lo,index-1);
        quicksort(array,index+1,hi);

    }

    private static int partion(int[] array, int lo, int hi) {
        int index=array[lo];

        while(lo<hi){
            while(lo<hi&&array[hi]>=index){
                hi--;
            }
            swap(array,lo,hi);
            while(lo<hi&&array[lo]<=index){//必须是等于！！！
                lo++;
            }
            swap(array,lo,hi);
            array[lo]=index;
        }
        return lo;
    }

    private static void swap(int[] array, int lo, int hi) {
        int temp=array[lo];
        array[lo]=array[hi];
        array[hi]=temp;
    }
    public static int  Findofstring(String str,String str1){
        if(str.length()<str1.length()){
            return -1;
        }
        if(str==null&&str1==null){
            return -1;
        }
        boolean[] judge=new boolean[str.length()];
        for (int i = 0; i < judge.length; i++) {
            judge[i]=false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str1.charAt(0)){
               if( Decide(str,str1,i,0,judge)){
                   return i;
               }
            }

        }
        return -1;
    }

    private static boolean Decide(String str, String str1, int i, int i1, boolean[] judge) {
        if(i>=str.length()||i1>i||judge[i]==true||i1>=str1.length()||str.charAt(i)!=str1.charAt(i1)){
            return false;
        }
        if(i1==str1.length()-1){
            return true;
        }
        judge[i]=true;
        return Decide(str,str1,i+1,i1+1,judge);


    }
}
