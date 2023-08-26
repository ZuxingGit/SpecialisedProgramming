package classContent.wk5.sameTree;

public class ConstructBinaryTree2String {
    public static void main(String[] args) {
        TreeNode tree1= new TreeNode(1,new TreeNode(2,new TreeNode(4),null),new TreeNode(3));
        TreeNode tree2= new TreeNode(1,new TreeNode(2,null, new TreeNode(4)),new TreeNode(3));
        tree1.printTree();
        System.out.println(tree2str(tree1));
        tree2.printTree();
        System.out.println(tree2str(tree2));
    }
    
    public static String tree2str(TreeNode root) {
        if (root==null)
            return "()";
        
        StringBuilder sb= new StringBuilder();
        sb.append(root.val);
        
        if (root.left!=null) {
            sb.append("(").append(tree2str(root.left)).append(")");
            if (root.right!=null)
                sb.append("(").append(tree2str(root.right)).append(")");
            
            return sb.toString();
        } else {
            if (root.right!=null)
                sb.append("()").append("(").append(tree2str(root.right)).append(")");
            
            return sb.toString();
        }
    }
}
