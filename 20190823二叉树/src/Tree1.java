import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.*;
import java.util.ArrayList;

class TreeNode{
    char val;
    TreeNode left;
    TreeNode right;
    TreeNode(char val){
        this.val=val;
    }
}
public class Tree1 {
    //前序遍历
    public void  preOrderTraversal(TreeNode root){
        if(root==null){
            return ;
        }
        //根  左   右
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void inOrderTraversal(TreeNode root){
        if(root==null){
            return ;
        }
        //左    根    右
        inOrderTraversal(root.left);
        System.out.print(root.val);
        inOrderTraversal(root.right);
    }
    public void postOrderTraversal(TreeNode root){
        if(root==null){
            return ;
        }
        //左 右  根
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);
    }
    private TreeNode bulidTree(){
        TreeNode a= new TreeNode('A');
        TreeNode b= new TreeNode('B');
        TreeNode c= new TreeNode('C');
        TreeNode d= new TreeNode('D');
        TreeNode e= new TreeNode('E');
        TreeNode f= new TreeNode('F');
        TreeNode g= new TreeNode('G');
        TreeNode h= new TreeNode('H');
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        d.left=h;d.right=null;
        e.left=null;f.left=null;
        f.right=null;
        return a;
    }
    public static  int calCount(TreeNode root){//计算结点
        if(root==null){
            return 0;
        }
       int left= calCount(root.left);
        int right=calCount(root.right);
        int count=left+right+1;
        return count;
    }
    //遍历方法计算叶子结点
    public static int countLeave=0;
    public static void calcLeave(TreeNode root){//计算叶子结点
        if(root==null){
            return ;
        }//中序判断
        calcLeave(root.left);
        if(root.left==null&&root.right==null){
            countLeave++;
        }
        calcLeave(root.right);
    }
    //汇总
    public static  int calLeave2(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int left=calLeave2(root.left);
        int right=calLeave2(root.right);
        int count=left+right;
        return count;
    }
    //计算树的高度
    public static  int kTreeHeight(TreeNode root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        int left=kTreeHeight(root.left,k-1);
        int right=kTreeHeight(root.right,k-1);
        int count=left+right;
        return count;
    }
    //查找树的结点的值是否存在
    public static  TreeNode searchNode(TreeNode root,char val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
          TreeNode left=searchNode(root.left, val);
        if(left!=null){
            return left;
        }
        TreeNode right=searchNode(root.right,val);
        if(right!=null){
            return right;
        }
        return null;
    }
    //查找给定结点值是否存在
    public static boolean searchNode2(TreeNode root,char val){
        if(root==null){
            return false;
        }
        if(root.val==val){
            return true;
        }
        boolean left=searchNode2(root.left,val);
        if(left){
            return true;
        }
        boolean right=searchNode2(root.right,val);
        if(right){
            return true;
        }
        return false;
    }
    //返回树的高度
    public static int calHeight(TreeNode root){
        if(root==null) {
            return 0;
        }
        int left=calHeight(root.left);
        int right=calHeight(root.right);
        int count=Math.max(left,right)+1;
        return count;
    }
    public static boolean isMirror(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return  false;
        }
        return p.val==q.val&&isMirror(p.left,q.right)&&isMirror(p.right,q.left);
    }

    /**
     * 由前序遍历和中序遍历还原二叉树
     * @param preOrder，表示前序
     * @param inOrder，表示中序
     * @return 返回根节点
     */
    public static TreeNode buildTree1(List<Character> preOrder,List<Character> inOrder){
        if(preOrder.size()==0){
            return null;
        }
        char rootval= preOrder.get(0);
        TreeNode root=new TreeNode(rootval);
        int leftCount=inOrder.indexOf(rootval);
        List<Character> leftpreOrder=preOrder.subList(1,leftCount+1);//左闭右开区间
        List<Character> leftinOrder=inOrder.subList(0,leftCount);
        TreeNode left=buildTree1(leftpreOrder,leftinOrder);
        root.left=left;
        List<Character> rightpreOrder=preOrder.subList(1+leftCount,preOrder.size());
        List<Character> rightinOrder=inOrder.subList(leftCount+1,inOrder.size());
        TreeNode right=buildTree1(rightpreOrder,rightinOrder);
        root.right=right;
        return root;
    }

    /**
     * 由中序遍历和后序遍历还原二叉树
     * @param inOrder 中序遍历
     * @param postOrder 后序遍历
     * @return 返回根节点
     */
    public static TreeNode buildTree2(List<Character> inOrder,List<Character> postOrder){
        if(inOrder.size()==0){
            return null;
        }
        char rootval=postOrder.get(postOrder.size()-1);
        int leftCount=inOrder.indexOf(rootval);
        TreeNode root=new TreeNode(rootval);
        List<Character> leftinOrder=inOrder.subList(0,leftCount);
        List<Character> leftpostOrder=postOrder.subList(0,leftCount);
        TreeNode left=buildTree2(leftinOrder,leftpostOrder);
        root.left=left;
        List<Character> rightinOrder=inOrder.subList(leftCount+1,inOrder.size());
        List<Character> rightpostOrder=postOrder.subList(leftCount,postOrder.size()-1);
        TreeNode right=buildTree2(rightinOrder,rightpostOrder);
        root.right=right;
        return root;
    }
    public static void main(String[] args) {
       /*  Tree1 tree=new Tree1();
            TreeNode root=tree.bulidTree();
        System.out.println("前序遍历：");
            tree.preOrderTraversal(root);
        System.out.println("中序遍历");
            tree.inOrderTraversal(root);
        System.out.println("后序遍历");
            tree.postOrderTraversal(root);
        System.out.println("结点个数："+tree.calCount(root));
        System.out.println("叶子结点个数："+ tree.calLeave2(root));
        System.out.println("树的第k层有几个结点："+tree.kTreeHeight(root,2));
        System.out.println("查找树的结点是否存在"+  tree.searchNode2(root,'D'));
        System.out.println("计算树的高度："+tree.calHeight(root));
*/
       List<Character> preOrder=Arrays.asList('A','B','D','E','G','C','F','H');
        List<Character> inOrder=Arrays.asList('D', 'B', 'G', 'E', 'A', 'C', 'F', 'H');
        List<Character> postOrder=Arrays.asList('D','G','E','B','F','H','C','A');
        TreeNode root1=buildTree1(preOrder,inOrder);
        System.out.println("Yeah");
        TreeNode root2=buildTree2(inOrder,postOrder);
        System.out.println("YYY");
}
}
