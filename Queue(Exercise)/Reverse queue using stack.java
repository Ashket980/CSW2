import java.util.*;

public class Q5 {
	private static void reverseQueue(Queue<Integer> queue) {
		int n = queue.size();
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			int curr = queue.poll();
			stack.push(curr);
		}
		for (int i = 0; i < n; i++) {
			int curr = stack.pop();
			queue.add(curr);
		}
		for (Integer i : queue) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(10);
		q1.add(8);
		q1.add(4);
		q1.add(23);
		reverseQueue(q1);
		
	}
}
