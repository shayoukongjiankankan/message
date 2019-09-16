import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alibaba {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public static int getBoy(String users) {
        char []array= users.toCharArray();
        int sum=0;
        int answer=-1;
        for (int i = 0; i < array.length; i++) {
            int length=0;
            int ans=-1;
            if (i==0){
                if (array[array.length-1]=='g'&&array[i]=='b'&&array[i+1]=='g'){

                    ans=i;
                    answer=ans;
                    break;
                }
                if (array[i]!='g'&&array[i+1]=='g'){
                    length=1;
                }
                if (length>sum){
                    sum=length;
                    ans=i;
                }

            }else
            if (i==array.length-1){
                if (array[0]=='g'&&array[i]=='b'&&array[i-1]=='g'){
                    length=2;
                    ans=i;
                    answer=ans;
                    break;
                }
                if (array[i-1]=='g'&&array[i]=='b'){
                    length=1;
                    if (length>sum){
                        sum=length;
                        ans=i;
                    }
                }
            }else
            if (array[i]=='b'){
                if (array[i-1]=='g'&&array[i]=='b'&&array[i+1]=='g'){
                    length=2;
                    ans=i;
                    answer=ans;
                    break;
                }else if (array[i-1]=='g'||array[i+1]=='g'){
                    length=1;
                    if (length>sum){
                        sum=length;
                        ans=i;
                    }
                }
            }

            answer=ans;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int boynum=0;
        int maxofnum=0;

        String _users;
        try {
            _users = in.nextLine();
        } catch (Exception e) {
            _users = null;
        }
        int num=in.nextInt();
        boynum = getBoy(_users);
        maxofnum=getIndexAndLongest(_users,num);
        System.out.print(boynum+" "+maxofnum);

    }

    private static int getIndexAndLongest(String users, int num) {
        char[]array=users.toCharArray();

        int sum1=0;
        int sum2=0;

        for (int i = 0; i < array.length; i++) {
            int length=0;
            int ans=-1;
            if (i==0){
                if (array[array.length-1]=='b'&&array[i]=='g'&&array[i+1]=='b'){
                    sum2+=2;
                }
                if (array[i]!='b'&&array[i+1]=='b'){
                    sum1+=1;
                }

            }else if (i==array.length-1){
                if (array[0]=='b'&&array[i]=='g'&&array[i-1]=='b'){
                    sum2+=2;
                }
                if (array[i-1]=='b'&&array[i]=='g'){
                    sum1+=1;

                }
            }else if (array[i]=='b'){
                if (array[i-1]=='g'&&array[i]=='b'&&array[i+1]=='g'){
                    sum2+=2;
                }else if (array[i-1]=='g'||array[i+1]=='g'){
                    sum1+=1;

                }
            }


        }
        if (sum2>=2*num){
            return 2*num;
        }else if (sum2<2*num&&2*num<sum2+sum1){
            return num-sum2/2+sum2;
        }else {
            return sum1+sum2;
        }

    }
}
