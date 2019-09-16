public class Multipy {
    public static void main(String[] args) {

    }
    public int[] multiply(int[] A) {
        if (A.length==0){
            return null;
        }
        int []B=new int[A.length];
        B[0]=1;
        for (int i = 1; i <A.length ; i++) {
            B[i]=B[i-1]*A[i-1];
        }
        int temp=1;
        for (int i = A.length-2; i >=0 ; i--) {
            temp*=A[i+1];
            B[i]*=temp;
        }
        return B;
    }
    public static int[] mutipy1(int []A){
        if (A.length==0){
            return  null;
        }
        int[]B=new int[A.length];
        int[]C=new int[A.length];
        int[]D=new int[A.length];
        C[0]=1;
        for (int i = 1; i <A.length ; i++) {
            C[i]=C[i-1]*A[i-1];
        }
        D[A.length-1]=1;
        for (int i = A.length-2; i >=0 ; i--) {
            D[i]=D[i+1]*A[i+1];
        }
        for (int i = 0; i <A.length ; i++) {
            B[i]=C[i]*D[i];
        }
        return B;
    }
}
