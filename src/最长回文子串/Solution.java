package 最长回文子串;


class Solution {
    public static void main(String[] args) {
        String str= "ccc";
        Solution solution=new Solution();
        System.out.println(solution.longestPalindrome(str));
    }
//    public String longestPalindrome(String s) {
//        if (s.length()<=1){
//            return s;
//        }
//        StringBuffer sb=new StringBuffer();
//        for (int i = 0; i <s.length() ; i++) {
//            sb.append(s.charAt(s.length()-i-1));
//        }
//        String str=sb.toString();
//        return commenSonofstr(s,str);
//    }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int[][]dp=new int[s.length()][s.length()];
        int start=0;
        int max=1;
        for (int i = 0; i < s.length()-1; i++) {
            dp[i][i]=1;
            if (s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                start=i;
                max=2;
            }
        }

        for (int l = 3; l <s.length() ; l++) {
            for (int i = 0; i+l-1 <s.length() ; i++) {
                int j = l+i-1;  //终止字符位置

                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1){

                    dp[i][j]=1;
                    max=l;
                    start=i;
                }
            }
        }
        System.out.println(max);
        return s.substring(start,start+max);
    }
//        int[][]array=new int[s.length()][str.length()];
//        int maxlength=0;
//        int start=-1;
//        for (int i = 0; i <s.length() ; i++) {
//            for (int j = 0; j <str.length() ; j++) {
//                if (s.charAt(i)==str.charAt(s.length()-j-1)) {
//                    if (i>0&&j>0){
//                        array[i][j]=array[i-1][j-1]+1;
//                    }else {
//                        array[i][j]=1;
//                    }
//                    if (maxlength<array[i][j]){
//                        maxlength=array[i][j];
//                        start=i;
//                    }
//                }
//            }
//        }
//        System.out.println(start);
//        StringBuffer sb=new StringBuffer();
//        for (int i = start-maxlength+1; i <=start; i++) {
//            sb.append(s.charAt(i));
//        }
//        return sb.toString();
//    }
}