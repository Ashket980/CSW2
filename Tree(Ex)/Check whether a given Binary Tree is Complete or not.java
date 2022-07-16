import java.util.*;

public class Q5 {

	static class node {
		int data;
		node left;
		node right;
	};

	static boolean isCompleteBT(node root) {

		if (root == null)
			return true;

		Queue<node> q = new LinkedList<>();
		q.add(root);

		boolean flag = false;

		while (!q.isEmpty()) {
			node temp = q.peek();
			q.remove();

			if (temp == null) {

				flag = true;
			} else {
				if (flag == true) {
					return false;
				}

				q.add(temp.left);
				q.add(temp.right);
			}
		}

		return true;
	}

	static node newNode(int data) {
		node node = new node();
		node.data = data;
		node.left = null;
		node.right = null;
		return (node);
	}

	public static void main(String[] args) {

		node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.left.right = newNode(5);
		root.right.left = newNode(6);

		if (isCompleteBT(root) == true)
			System.out.print("Complete Binary Tree");
		else
			System.out.print("NOT Complete Binary Tree");

	}
}
