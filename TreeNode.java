//Template Class
public class TreeNode {
	int data = -1;
	TreeNode leftChild = null;
	TreeNode rightChild = null;
	
	public TreeNode(){
		
	}
	
	public TreeNode(int data){
		this.data = data;
	}
	
	public TreeNode(int data, TreeNode leftChild, TreeNode rightChild){
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
}
