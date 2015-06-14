import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {
	public static void BFS(TreeNode root){
		//variables
		LinkedList <TreeNode> queue1 = new LinkedList<TreeNode>();
		LinkedList <TreeNode> queue2 = new LinkedList<TreeNode>();
		TreeNode tmp;
		
		//Initialization
		queue1.push(root);
		
		while(!queue1.isEmpty()){
			//store element in tmp
			tmp = queue1.removeFirst();
			//print tmp
			System.out.println(tmp.data);
			
			//push all children and store them in queue2
			if(tmp.leftChild!=null) queue2.push(tmp.leftChild);
			if(tmp.rightChild!=null) queue2.push(tmp.rightChild);
			
			//if queue1 is empty, this means that this level of tree has been all traversed.
			//Set queue1 as queue2
			//Notice this is not the best implementation of performing this task.
			if(queue1.isEmpty()){
				while(!queue2.isEmpty()){
					queue1.push(queue2.removeFirst());
				}
			}
		}	
	}
	
	public static void DFS(TreeNode root){
		//Variable Declaration
		LinkedList <TreeNode> stack = new LinkedList<TreeNode>();
		TreeNode tmp;
		
		//Initialization of stack
		stack.push(root);
		
		while(!stack.isEmpty()){
			//Store one element in tmp
			tmp = stack.pop();
			//Output
			System.out.println(tmp.data);

			//Stack inputs
			if(tmp.rightChild!=null) stack.push(tmp.rightChild);
			if(tmp.leftChild!=null) stack.push(tmp.leftChild);
		}
	}
	
	public static void main(String args[]){

		TreeNode root = new TreeNode(5);
		TreeNode left1 = new TreeNode(3);
		TreeNode right1 = new TreeNode(8);

		root.leftChild = left1;
		root.rightChild = right1;
		
		TreeNode left11 = new TreeNode(1);
		TreeNode left12 = new TreeNode(4);
		
		left1.leftChild = left11;
		left1.rightChild = left12;
		
		TreeNode left112 = new TreeNode(2);
		
		left11.rightChild = left112;
		
		TreeNode right11 = new TreeNode(7);
		TreeNode right12 = new TreeNode(9);
		TreeNode right111 = new TreeNode(6);
		TreeNode right122 = new TreeNode(10);
		TreeNode right1222 = new TreeNode(11);
		
		right1.leftChild = right11;
		right1.rightChild = right12;
		right11.leftChild = right111;
		right12.rightChild = right122;
		right122.rightChild = right1222;
	
		//BFS(root);
		DFS(root);
	}
}

