
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int diff = getHeight(root.left) - getHeight(root.right);
        
        if(diff > 1 || diff < -1)
        return false;
        else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
    private int getHeight(TreeNode node){
        if (node == null) return 0;
        else{
            return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        }
    }
    
    public boolean isBalancedOP(TreeNode root){
    	if (checkHeight(root) == -1)
    		return false;
    	else{
    		return true;
    	}
    }

	private int checkHeight(TreeNode node) {
		if (node == null)
			return 0;
		
		int left = checkHeight(node.left);
		if(left == -1)
			return -1;
		
		int right = checkHeight(node.right);
		if(right == -1)
			return -1;
		
		
		int diff = checkHeight(node.left) - checkHeight(node.right);
		if (Math.abs(diff) > 1)
			return -1;
		else{
			return Math.max(left, right);
		}
		
	}
}
