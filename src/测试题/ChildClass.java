package 测试题;
import 测试题.FatherClass;
public class ChildClass extends FatherClass {
    public ChildClass(){
        System.out.println("ChildClass Create");
    }

    public static void main(String[] args) {
        FatherClass fc=new FatherClass();
        ChildClass cc=new ChildClass();
    }
}
