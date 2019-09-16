package 包裹黑点的最小矩形;

public class Solution {
    public static void main(String[] args) {
        char [][]image={{0,0,1,0},{0,1,1,0},{0,1,0,0}};
        System.out.println(minArea(image,0,2));
    }
    /**
     * @param image: a binary matrix with '0' and '1'
     * @param x: the location of one of the black pixels
     * @param y: the location of one of the black pixels
     * @return: an integer
     */
    public static int minArea(char[][] image, int x, int y) {
        // write your code here
        Boolean []flag=new Boolean[image.length*image[0].length];
        for (int i = 0; i <flag.length ; i++) {
            flag[i]=false;
        }
        long [] size={x,x,y,y};

        DFS1(image,x,y,flag,size);
        return (int) ((size[1]-size[0]+1)*(size[3]-size[2]+1));
    }

    private static void DFS1(char[][] image, int x, int y, Boolean[] flag, long[] size) {
        if (x<0||y<0||x>image.length-1||y>image[0].length-1||flag[x*image[0].length+y]==true||image[x][y]=='0'){
            return;
        }
        if (x<size[0]){
            size[0]=x;
        }
        if (x>size[1]){
            size[1]=x;
        }
        if (y<size[2]){
            size[2]=y;
        }
        if (y>size[3]){
            size[3]=y;
        }
        flag[x*image[0].length+y]=true;
        DFS1(image,x-1,y,flag,size);
        DFS1(image,x,y-1,flag,size);
        DFS1(image,x+1,y,flag,size);
        DFS1(image,x,y+1,flag,size);
    }
}
