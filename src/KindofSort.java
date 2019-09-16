import java.util.Arrays;
//快排，归并，希尔，堆排，插入以及冒泡六种排序
public class KindofSort {
    public static void main(String[] args) {
        int[]array={1,2,3,4,2,5,2,7,4,3,23};
        heapsort(array);
//        (array,0,array.length-1);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.println(Arrays.toString(array));
    }
    public static void Quicksort(int []array,int lo,int hi){//快速排序
        if (array.length==0){
            return;
        }
        if (lo>=hi){
            return;
        }
        int index=patition(array,lo,hi);
        Quicksort(array,lo,index-1);
        Quicksort(array,index+1,hi);
    }

    private static int patition(int[] array, int lo, int hi) {
        int key=array[lo];
        while (lo<hi){
            while(lo<hi&&array[hi]>=key){
                hi--;
            }
            swap(array,lo,hi);
            while(lo<hi&&array[lo]<=key){
                lo++;
            }
            swap(array,lo,hi);
        }
        return lo;
    }

    private static void swap(int[] array, int lo, int hi) {
        if (lo!=hi){
            int temp=array[lo];
            array[lo]=array[hi];
            array[hi]=temp;
        }
    }
    public static void sortofmerge(int []array,int lo,int hi){//归并排序
        if (array.length==0){
            return ;
        }
        if (lo>=hi){
            return;
        }
        int middle=(lo+hi)/2;
        sortofmerge(array,lo,middle);
        sortofmerge(array,middle+1,hi);
       merge(array,lo,hi,middle);
    }

    private static void merge(int[] array, int lo, int hi, int middle) {
        int []temp=new int[hi-lo+1];
        int index1=lo;
        int index2=middle+1;
        int k=0;
        while(index1<=middle&&index2<=hi){
            if (array[index1]>=array[index2]){
                temp[k++]=array[index2++];
            }else{
                temp[k++]=array[index1++];
            }
        }
        while (index1<=middle){
            temp[k++]=array[index1++];
        }
        while (index2<middle){
            temp[k++]=array[index2++];
        }
        for (int i=0;i<temp.length;i++){
            array[lo+i]=temp[i++];
        }

    }
    public static void Maxmin(int []array){
        if (array.length<=1){
            return;
        }
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>array[j]){
                    swap(array,i,j);
                }
            }

        }
    }
    public static void insertSort(int []array){//插入排序
        if (array.length==0){
            return;
        }
        for (int i = 1; i <array.length ; i++) {
            int temp=array[i];
            int j;
            for ( j =i ; j >0&&array[j-1]>temp; j--) {
                    array[j]=array[j-1];
            }
            array[j]=temp;
        }
    }
    public static void shellsort(int []arr){//希尔排序

                for(int gap=arr.length/2;gap>0;gap/=2){//增量gap，并逐步缩小增量
                        //从第gap个元素，逐个对其所在组进行直接插入排序操作
                       for(int i=gap;i<arr.length;i++){
                                int j = i;
                                int temp = arr[j];
                             if(arr[j]<arr[j-gap]){
                                while(j-gap>=0&&temp<arr[j-gap])  {            //移动法
                                       arr[j] = arr[j-gap];
                                       j-=gap;
                                     }
                             }
                                       arr[j] = temp;
                                  }
                             }
                  }

    public static void heapsort(int []arr){
        //构建大顶堆
        for (int i =arr.length/2-1 ; i >=0; i--) {
            adjustHeap(arr,i,arr.length);
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }
    }
    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * @param arr
     * @param length
     */

    private static void adjustHeap(int[] arr, int i, int length) {
        int temp=arr[i];
        for (int j = i*2+1; j <length ; j=2*j+1) {
            if (j+1<length&&arr[j]<arr[j+1]){
                j++;
            }
            if (arr[j]>temp){//如果交换了，会导致子根的混乱，继续对子根进行调整
                arr[i]=arr[j];
                i=j;
            }else {
                break;
            }
        }
        arr[i]=temp;
    }
}
