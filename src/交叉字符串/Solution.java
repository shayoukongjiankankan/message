package 交叉字符串;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s1="sdfjas;dfjoisdufzjkndfasdkfja;sdfa;dfa;dfaskdjhfasdhjdfakhdgfkajdfasdjfgajksdfgaksdhfasdkbfjkdsfbajksdfhakjsdfbajkdfbakdjsfgaksdhgfjkdsghfkdsfgadsjfgkajsdgfkjasdfh";
        String s2="dfnakdjnfjkzghdufguweygfasjkdfgb2gf8asf7tgbgasjkdfgasodf7asdgfajksdfguayfgaogfsdkagfsdhfajksdvfbgkadsghfakdsfgasduyfgajsdkfgajkdghfaksdgfuyadgfasjkdvfjsdkvfakfgauyksgfajkefgjkdasgfdjksfgadjkghfajksdfgaskdjfgasjkdgfuyaegfasdjkfgajkdfygadjskfgjkadfg";
        String s3="sdfjas;dfjoisdfnakdjnfjkzghdufguwdufzjkeygfasjkdfgb2gf8asf7ndtgbgasjkdfgasodf7asdfgfajkasdksdfguayfgaogfsdkagfsfjadhfajksdvfbgkadsghfa;sdkdsfgasduyfgajsdkfgafajkdghfaksdgfuyadgfas;dfjkdvfjsdkvfakfgauyksa;dgfajkefgjkdasgfdjksffaskdjhfasdhjdfakhdgadjkghfajgfkajdfksdfgaskdjfgasjkdgfuasdjfgajksdfgaksdhfasdkbfjkdsfbajksdfyaegfasdjkfgajkdfygadjskfgjkadfghakjsdfbajkdfbakdjsfgaksdhgfjkdsghfkdsfgadsjfgkajsdgfkjasdfh";
        Solution solution=new Solution();
        System.out.println(solution.isInterleave(s1,s2,s3));
    }
    /**
     * @param s1: A string
     * @param s2: A string
     * @param s3: A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        Stack<Character>stack1=new Stack<>();
        Stack<Character>stack2=new Stack<>();
        Stack<Character>stack3=new Stack<>();
        for (int i = s1.length()-1; i >=0 ; i--) {
            stack1.add(s1.charAt(i));
        }
        for (int i = s2.length()-1; i >=0 ; i--) {
            stack2.add(s2.charAt(i));
        }
        for (int i = s3.length()-1; i >=0 ; i--) {
            stack3.add(s3.charAt(i));
        }

        boolean flag=false;
        while (!(stack3.isEmpty()&&stack1.isEmpty()&&stack2.isEmpty())){

            while (!stack1.isEmpty()&&stack3.peek()==stack1.peek()){
                stack3.pop();
                stack1.pop();
            }
            while(!stack2.isEmpty()&&stack3.peek()==stack2.peek()){
                stack3.pop();
                stack2.pop();
            }
            if (!stack1.isEmpty()&&!stack2.isEmpty()&&!stack3.isEmpty()){
                if (stack3.peek()!=stack1.peek()&&stack3.peek()!=stack2.peek()){
                    System.out.println(1);
                    System.out.println(stack1.peek());
                    System.out.println(stack2.peek());
                    System.out.println(stack3.peek());
                    flag=true;
                    break;
                }
            }
            if (stack1.isEmpty()&&stack2.isEmpty()&&!stack3.isEmpty()){
                System.out.println(2);
                flag=true;
                break;
            }
            if (stack1.isEmpty()&&!stack2.isEmpty()&&!stack3.isEmpty()){
                System.out.println(3);
                if (stack2.peek()!=stack3.peek()){
                    flag=true;
                    break;
                }
            }
            if (stack2.isEmpty()&&!stack1.isEmpty()&&!stack3.isEmpty()){
                System.out.println(4);
                if (stack1.peek()!=stack3.peek()){
                    flag=true;
                    break;
                }
            }
        }
        if (flag==true){
            return false;
        }else {
            return true;
        }
    }
}