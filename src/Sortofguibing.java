public class Sortofguibing {
    public static void main(String[] args) {
        int []array={1,2,3,4,2,5,2,7,4,3,23};
        Sortofgui(array,0,array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static  void Sortofgui(int[] array,int lo,int hi){
        if(array.length<0){
            return;
        }
        if (lo>=hi){
            return;
        }
        int middle=(lo+hi)/2;
        Sortofgui(array,lo,middle);
        Sortofgui(array,middle+1,hi);
        merge(array,middle,lo,hi);
    }

    private static void merge(int[] array, int middle, int lo, int hi) {
        int []temp=new int[hi-lo+1];
        int k=0;
        int i=lo;
        int j=middle+1;
        while(i<=middle&&j<=hi){
            if(array[i]<array[j]){
                temp[k++]=array[i++];
            }else{
                temp[k++]=array[j++];
            }
        }
        while(i<=middle){
            temp[k++]=array[i++];
        }
        while(j<=hi){
            temp[k++]=array[j++];
        }
        for (int l = 0; l <temp.length ; l++) {
            array[l+lo]=temp[l];
        }

    }


}
