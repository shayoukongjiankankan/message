package 大顶堆小顶堆问题;
//如果不提供Comparator的话，优先队列中元素默认按自然顺序排列，
// 也就是数字默认是小的在队列头，字符串则按字典序排列（参阅 Comparable），
// 也可以根据 Comparator 来指定
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(11,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2.compareTo(o1);
            }
        });

        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        int []array={1,5,9,6,8,7,5,6,2,5,8,9,7,5,6,4,44,2,255,45,87};
        maxK(minHeap,array,8);
        minK(maxHeap, array,8);
        while(!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll()+" ");
        }
        System.out.println();
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+" ");
        }
    }

    private static void maxK(PriorityQueue<Integer> minHeap, int[] array,int k) {
        for (int i = 0; i <array.length ; i++) {
            if (minHeap.size()<k){
                minHeap.offer(array[i]);
            }else {

                if (array[i]>minHeap.peek()){
                    minHeap.poll();
                    minHeap.offer(array[i]);
                }
            }
        }
    }

    private static void minK(PriorityQueue<Integer> maxHeap, int[] array,int k) {
        for (int i = 0; i <array.length ; i++) {
            if (maxHeap.size()<k){
                maxHeap.offer(array[i]);
//                System.out.println(minHeap.size());
            }else {
                int num=maxHeap.peek();
                if (num>array[i]){
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
    }


}
