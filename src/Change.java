import java.lang.StringBuffer;
public class Change {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("abcd");
        sb.append(" ");
        System.out.println(sb);
        System.out.println(replaceSpace(sb));
    }
    public static String replaceSpace1(StringBuffer str) {
        if (str==null){
            return null;
        }
        String str2=str.toString();
        System.out.println(str2);
        if(str2==null&&str2.length()==0){
            return null;
        }
        String []str1=str2.split(" ");
        for (int i = 0; i <str1.length ; i++) {
            System.out.println(str1[i]);
        }
        StringBuffer sb=new StringBuffer();
        if (str1.length==0){
            for (int i = 0; i <str2.length() ; i++) {
                sb.append("%20");
            }
            return sb.toString();
        }
        System.out.println(str1.length);
        int k=str2.length()-1;
        int count1=0;
        while(k>=0&&str2.charAt(k)==' '){
            count1++;
            k--;
        }
        int j=0;
        int count2=0;
        while(j<str2.length()&&str2.charAt(j)==' '){
            count2 ++;
            j++;
        }

        for(int i=0;i<count2-1;i++){
            sb.append("%20");
        }
        for(int i=0;i<str1.length;i++){

            sb.append(str1[i]);
            if(i!=str1.length-1){
                sb.append("%20");
            }
        }
        for(int i=0;i<count1;i++){
            sb.append("%20");
        }
        return sb.toString();
    }
    public static String replaceSpace(StringBuffer str) {

        StringBuffer sb=new StringBuffer();

        for (int i=0;i<str.length();i++){

            if (str.charAt(i)== ' '){
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
