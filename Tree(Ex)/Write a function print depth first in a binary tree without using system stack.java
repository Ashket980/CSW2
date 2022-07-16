
public class Q4 {
	public void PrintDepthFirst() {
		ArrayDeque<Node> stk = new ArrayDeque<Node>();
		Node temp;
		if (root != null)
			stk.push(root);
		while (stk.isEmpty() == false) {
			temp = stk.pop();
			System.out.println(temp.value);
			if (temp.lChild != null)
				stk.push(temp.lChild);
			if (temp.rChild != null)
				stk.push(temp.rChild);
		}
	}

}
