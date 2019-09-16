public class Maxson {
    public static void main(String[] args) {
        int[]array1={10,9,2,5,3,4};
        int[] array2={2,3,4,5,9,10};
        System.out.println(Masonofstr(array1,array2));

    }
//    public static int Masonofstr(int[] array, int[] array1) {
//        int[][]array2=new int[array.length][array1.length];
//        int maxlength=0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j <array1.length ; j++) {
//                if (array[i]==array1[j]){
//                    if (i>0&&j>0){
//                        array2[i][j]=array2[i-1][j-1]+1;
//                    }else{
//                        array2[i][j]=1;
//                    }
//                }else {
//                    if (i>0&&j>0){
//                        array2[i][j]=Math.max(array2[i-1][j],Math.max(array2[i][j-1],array2[i-1][j-1]));
//                    }else{
//
//                    }
//                    array2[i][j]=0;
//                    }
//
//                }
//
//        }
//        return array2[array1.length-1][array2.length-1];
//    }
        public static int Masonofstr(int[] array, int[] array1) {
        int[][]array2=new int[array.length+1][array1.length+1];
            for (int i = 0; i <=array.length ; i++) {
                array2[i][0]=0;
            }
            for (int i = 0; i <=array1.length ; i++) {
                array2[0][i]=0;
            }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array1.length ; j++) {
                if (array[i]==array1[j]){


                    array2[i+1][j+1]=array2[i][j]+1;

                }else {

                        array2[i+1][j+1]=Math.max(array2[i+1][j],Math.max(array2[i][j+1],array2[i][j]));


                }

            }

        }
        return array2[array.length][array1.length];
    }

}