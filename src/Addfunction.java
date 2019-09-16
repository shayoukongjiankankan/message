import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Addfunction {
    public static void main(String[] args) {
//        int a=111,b=899;
//        System.out.println(Add(a,b));
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> all=new ArrayList<>();
        while(sc.hasNext()){
            int a=sc.nextInt();

            all.add(a);
            System.out.println(123);

        }
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
//        String str=sc.next();
//        char []charr=str.toCharArray();
//        char ch=charr[0];
////        char i = sc.nextChar();
//        Insert(ch);
//        System.out.println(FirstAppearingOnce());

    }
    public static int Add(int num1,int num2) {
        int sum=num1;
        int carry=num2;
        while(carry!=0){
            sum=num1^num2;
            carry=(num1&num2)<<1;//左移乘2
            num1=sum;
            num2=carry;
        }
         return num1;
    }
    static HashMap<Character,Integer> map=new HashMap<>();
    static ArrayList<Character> al=new ArrayList<>();
//    static StringBuffer sb=new StringBuffer();
    public static void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }

        al.add(ch);

    }

    //return the first appearence once char in current stringstream
    public static char FirstAppearingOnce()
    {
        char c='#';
        for (char index:al) {
            if (map.get(index)==1){
                c=index;
            }
        }

        return c;
    }
}
