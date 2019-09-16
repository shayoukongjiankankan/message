package 酷家乐;

public class Solution {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        int n=2;
        int m=3;
        Printarray(array,n,m);
    }
    public static void Printarray(int[] array, int n, int m) {
        int len = array.length;
        int t = len / (n + m);
        int p = len % (n + m);
        int o = (n + m);

        int[] newarray = new int[array.length];
        if (p != 0) {

            for (int i = 0; i < t + 1; i++) {
                for (int j = 0; j <= o; j++) {
                    if (i != t) {
                        if (j < n) {
                            newarray[i * o + j] = array[i * o + j];

                        } else if (n + m > j && j >= n) {
                            newarray[i * o + j] = array[i * o + o - j+1];

                        }
                    }
                    if (i == t) {
                        if (p < n) {
                            newarray[i * o + j] = array[i * o + j];
                        } else {
                            if (j < n) {
                                newarray[i * o + j] = array[i * o + j];
                            } else if (p >j && j >=n) {
                                newarray[i * o + j] = array[i * o + o - j+1];

                            }
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < o; j++) {

                    if (j < n) {
                        newarray[i * o + j] = array[i * o + j];
                    } else if (n + m > j && j >= n) {
                        newarray[i * o + j] = array[i * o + o - j+1];

                    }

                }
            }

        }
        for (int i = 0; i <newarray.length ; i++) {
            System.out.print(newarray[i]+" ");
        }

    }
}
