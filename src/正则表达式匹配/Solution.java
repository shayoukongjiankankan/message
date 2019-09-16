package 正则表达式匹配;

class Solution {
    public static void main(String[] args) {
        String s="a";
        String p="";
        Solution solution=new Solution();
        System.out.println(solution.isMatch(s,p));
    }
    public boolean isMatch(String s, String p) {
       if (s.length()==0||p.length()==0){
           return false;
       }
        int sindex=0;
        int pindex=0;
        return Match(s,p,sindex,pindex);
    }

    private boolean Match(String s, String p, int sindex, int pindex) {
        if (pindex==p.length()-1&&sindex!=s.length()-1){
            return false;
        }
        if (pindex==p.length()-1&&sindex==s.length()-1){
            return true;
        }
        if (pindex+1<p.length()-1&&p.charAt(pindex+1)=='*'){
            if ((sindex<s.length()&&s.charAt(sindex)==p.charAt(pindex))||(sindex<s.length()&&p.charAt(pindex)=='.')){
                return Match(s,p,sindex,pindex+2)||Match(s,p,sindex+1,pindex+2)||Match(s,p,sindex+1,pindex);
            }else {
                return Match(s,p,sindex,pindex+2);
            }
        }
        if ((sindex<s.length()&&s.charAt(sindex)==p.charAt(pindex))||(sindex<s.length()&&p.charAt(pindex)=='.')){
            return Match(s,p,sindex+1,pindex+1);
        }else {
            return false;
        }
    }
}