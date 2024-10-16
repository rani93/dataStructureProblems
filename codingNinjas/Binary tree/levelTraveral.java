import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class levelTraveral{
    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	ArrayList<Integer> answer = new ArrayList<>();
	if(root == null) return answer;
	Queue<BinaryTreeNode> helper = new LinkedList<>();
	helper.add(root);
	while(!(helper).isEmpty()){
		BinaryTreeNode element = helper.poll();
		answer.add(element.val);
		if(element.left!=null){
			helper.add(element.left);

		}
		if(element.right!=null){
			helper.add(element.right);
		}

		
	}
	return answer;

  }

}