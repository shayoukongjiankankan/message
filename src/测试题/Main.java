package 测试题;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            String s_nextLine=scanner.nextLine();
            String[] line= s_nextLine.split("\\s+");
            String template=line[0];
            Map<String,Object>param=new HashMap<>();
            for (int i = 0; i <line.length ; i++) {
                param.put(line[i],line[i+1]);
            }
            System.out.println(format(template,param));
        }finally {
            scanner.close();
        }
    }
    public static  String format(String template, Map<String,Object>param){
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        Stack<Character> stack3=new Stack<>();

        for (int i = 0; i <template.length() ; i++) {
            stack.add(template.charAt(i));

        }
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        while (!stack.isEmpty()){
            char ca=stack.pop();
            stack2.add(ca);
            if (ca=='}'){
                while (stack.peek()!='{'){
                    stack1.add(stack.pop());
                }
             stack3.add(stack.pop());
            }

        }
        StringBuffer sb=new StringBuffer();
        while (!stack1.isEmpty()){
            sb.append(stack1.pop());
        }
        while (!stack3.isEmpty()){
            sb1.append(stack1.pop());
        }
        while (!stack2.isEmpty()){
            sb2.append(stack1.pop());
        }
        String str=sb.toString();
        String str1= (String) param.get(str);
        String answer=sb1.toString()+str1+sb2.toString();
        return answer;
    }
}
