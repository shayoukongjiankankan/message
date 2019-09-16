import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        if (pRoot==null){
            return all;
        }
        queue.add(pRoot);
        int level = 0;
        int count = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                level++;
            }
            if (node.right != null) {
                queue.add(node.right);
                level++;
            }
            al.add(node.val);
            count--;
            if (count == 0) {
                all.add(al);
                al = new ArrayList<>();
                count = level;
                level = 0;
            }

        }
        return all;
    }
}
