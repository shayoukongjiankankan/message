package 酷家乐;

public class Test {
    public static void main(String[] args) {
        double[]nums={-1.6};
        for (double num:nums
             ) {
            test(num);
        }
    }

    private static void test(double num) {
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));
    }
}
