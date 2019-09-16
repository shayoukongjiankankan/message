import java.util.ArrayList;
//已知前序，中序，求树，求后序遍历
public class Reconstrut {
    public static void main(String[] args) {
        int []pre={10,6,4,8,14,12,16};
        int []in={4,6,8,10,12,14,16};
        TreeNode node=reConstructBinaryTree(pre,in);
        ArrayList <Integer> al=afteriter(node);
        for (int i = 0; i <al.size() ; i++) {
            System.out.print(al.get(i)+" ");
        }
    }
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length!=in.length){
            return  null;
        }
        if (pre.length==0){
            return null;
        }
        int start=0;
        int end=pre.length-1;
        int startin=0;
        int endin=pre.length-1;
        TreeNode node=reconstruct1(pre,start,end,in,startin,endin);
        return node;
    }

    private static TreeNode reconstruct1(int[] pre, int start, int end, int[] in, int startin, int endin) {
        if (start>end||startin>endin){
            return null;
        }
        TreeNode currentnode=new TreeNode(pre[start]);
        int index=0;
        for (int i=startin;i<=endin;i++){//这里要注意应该遍历到endin;
            if (in[i]==pre[start]){
                index=i;
                currentnode.left=reconstruct1(pre,start+1,index+start-startin,in,startin,index-1);
                currentnode.right=reconstruct1(pre,index+start-startin+1,end,in,index+1,endin);
            }
        }


                return currentnode;
    }
    static ArrayList al=new ArrayList();
    public static ArrayList afteriter(TreeNode node){//后序遍历方法
        if (node==null){
            return null;
        }

        afteriter(node.left);
        afteriter(node.right);
        al.add(node.val);
        return al;
    }

}
