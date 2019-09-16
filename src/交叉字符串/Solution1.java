package 交叉字符串;

public class Solution1 {
    public static void main(String[] args) {
//        String s1="sdfjas;dfjoisdufzjkndfasdkfja;sdfa;dfa;dfaskdjhfasdhjdfakhdgfkajdfasdjfgajksdfgaksdhfasdkbfjkdsfbajksdfhakjsdfbajkdfbakdjsfgaksdhgfjkdsghfkdsfgadsjfgkajsdgfkjasdfh";
//        String s2="dfnakdjnfjkzghdufguweygfasjkdfgb2gf8asf7tgbgasjkdfgasodf7asdgfajksdfguayfgaogfsdkagfsdhfajksdvfbgkadsghfakdsfgasduyfgajsdkfgajkdghfaksdgfuyadgfasjkdvfjsdkvfakfgauyksgfajkefgjkdasgfdjksfgadjkghfajksdfgaskdjfgasjkdgfuyaegfasdjkfgajkdfygadjskfgjkadfg";
//        String s3="sdfjas;dfjoisdfnakdjnfjkzghdufguwdufzjkeygfasjkdfgb2gf8asf7ndtgbgasjkdfgasodf7asdfgfajkasdksdfguayfgaogfsdkagfsfjadhfajksdvfbgkadsghfa;sdkdsfgasduyfgajsdkfgafajkdghfaksdgfuyadgfas;dfjkdvfjsdkvfakfgauyksa;dgfajkefgjkdasgfdjksffaskdjhfasdhjdfakhdgadjkghfajgfkajdfksdfgaskdjfgasjkdgfuasdjfgajksdfgaksdhfasdkbfjkdsfbajksdfyaegfasdjkfgajkdfygadjskfgjkadfghakjsdfbajkdfbakdjsfgaksdhgfjkdsghfkdsfgadsjfgkajsdgfkjasdfh";
        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";
        Solution1 solution=new Solution1();
        System.out.println(solution.isInterleave(s1,s2,s3));
    }
    /**
     * @param s1: A string
     * @param s2: A string
     * @param s3: A string
     * @return: Determine whether s3 is formed by interleaving of s1 and s2
     */
//    public boolean isInterleave(String s1, String s2, String s3) {
//        // write your code here
//        if (s1.length()+s2.length()!=s3.length()){
//            return false;
//        }
//        boolean [][]flag=new boolean[s1.length()][s2.length()];
//        for (int i = 0; i < s1.length(); i++) {
//            for (int j = 0; j <s2.length() ; j++) {
//                if (i>0&&j>0){
//                    flag[i][j]=(flag[i-1][j]&&s3.charAt(i+j)==s1.charAt(i))||(flag[i][j-1]&&s3.charAt(i+j)==s1.charAt(j));
//
//                }else if (i==0&&j>0){
//                    flag[i][j]=flag[i][j-1]&&s3.charAt(i+j)==s1.charAt(j);
//                }else if (i>0&&j==0){
//                    flag[i][j]=flag[i-1][j]&&s3.charAt(i+j)==s2.charAt(i);
//                }else {
//                    flag[i][j]=true;
//                }
//            }
//        }
//        return flag[flag.length-1][flag[0].length-1];
//    }
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if(s3.length() != s1.length() + s2.length()) {
            return false;
        }
        if(s1.equals("") && s2.equals(s3)) {
            return true;
        }
        if(s2.equals("") && s1.equals(s3)) {
            return true;
        }
        boolean [][]dp = new boolean[s1.length() + 1][s2.length() + 1];
        //边界条件
        dp[0][0] = true;

        //初始化dp[i][0]
        for(int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }
        //初始化dp[0][i]
        for(int i = 1; i <= s2.length() ; i++) {
            dp[0][i - 1] = dp[0][i - 1] && s2.charAt(i - 1) == s3.charAt(i - 1);
        }
        for(int i = 1; i <= s1.length(); i++) {
            for(int j = 1; j <= s2.length(); j++) {
                dp[i][j] = (s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j]) ||(s2.charAt(j - 1) == s3.charAt(i + j -1) && dp[i][j - 1]);
            }
        }
        return dp[s1.length()][s2.length()];
    }
}