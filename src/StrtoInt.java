public class StrtoInt {
    public static void main(String[] args) {
        String str="+123";
//        System.out.println(Isnum('y'));
        System.out.println(StrToInt(str));
    }
    public static int StrToInt(String str) {
        char []array=str.toCharArray();
        if (str.length()==0){
            return 0;
        }
        if(array[0]!='+'&&array[0]!='-'&&array[0]<'0'&&array[0]>'9'){
            return 0;
        }
        int []arraynum=new int[array.length];
        if (array[0]=='+'||array[0]=='-'){
            arraynum[0]=0;
            for (int i = 1; i <array.length ; i++) {
                if (Isnum(array[i])){
                    arraynum[i]=turnnum(array[i]);
                }else{
                    return  0;
                }
            }

            if (array[0]=='+'){
                int num=turnstringtonum(arraynum);
                System.out.println("true");
                return num;
            }else{
                int num=turnstringtonum1(arraynum);
                System.out.println("false");
                return num;
            }
        }else{
            for (int i = 0; i <array.length ; i++) {
                if (Isnum(array[i])){
                    arraynum[i]=turnnum(array[i]);
                }else{
                    return 0;
                }
            }

            int num=turnstringtonum(arraynum);
            return num;
        }

    }

    private static int turnstringtonum1(int[] arraynum) {
        int length=arraynum.length;
        int num=0;
        for (int i = 0; i <length ; i++) {
            num-=arraynum[i]*Math.pow(10,length-1-i);
        }
        return num;
    }

    private static int turnstringtonum(int[] arraynum) {
        int length=arraynum.length;
        int num=0;
        for (int i = 0; i <length ; i++) {
            num+=arraynum[i]*Math.pow(10,length-1-i);
        }
        return num;
    }

    private static int turnnum(char c) {
        int length=c-'0';
        int num=0;
        for (int i = 0; i <length ; i++) {
            num++;
        }
        return num;
    }


    private static Boolean Isnum(char ch) {
        if (ch<'0'||ch>'9'){
            return false;
        }
        return true;
    }
}
