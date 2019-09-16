package 测试题;
import java.util.*;
public class Test {
    public static void main(String[] args) {
//        Set<Short>s=new HashSet<Short>();
////        for (Short i = 0; i < 100; i++) {
////            s.add(i);
////            s.remove(i-1);
////        }
////        System.out.println(s.size());
//        int a=1,b=2;
//        swap(a,b);
//        Data data=new Data();
//        data.a=3;
//        data.b=4;
//        swap(data);
//        System.out.println(a+" "+b+" "+data.a+" "+data.b);
        Parent p=new Son();

    }
    public static void swap(Data data){
        int temp=data.a;
        data.a=data.b;
        data.b=temp;
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
class Data{
    int a;
    int b;
}
class Parent{
    static{
        System.out.println("Parent static");
    }
    public Parent(){
        System.out.println("parent construt");
    }
    {
        System.out.println("parent run");
    }
}
class Son extends Parent{
    static{
        System.out.println("chaild static");
    }
    public Son(){
        System.out.println("child construt");
    }
    {
        System.out.println("child run");
    }
}