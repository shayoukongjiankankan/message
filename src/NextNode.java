 class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class NextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.left==null&&pNode.right==null&&pNode.next==null){//边界值判定一定要掌握
            return null;
        }
        if (pNode.right!=null){
            TreeLinkNode currentNode=pNode.right;
            while(currentNode.left!=null){
                currentNode=currentNode.left;
            }
            return currentNode;
        }

        if (pNode.left==null&&pNode.next.right==pNode){
            TreeLinkNode fathernode=pNode.next;
            while(fathernode.next!=null&&fathernode!=fathernode.next.left){//防止越界的一定要放在&&前面！
                fathernode=fathernode.next;
            }
            if (fathernode.next==null){
                return null;
            }
            return fathernode.next;
        }

        return pNode.next;

    }
}
