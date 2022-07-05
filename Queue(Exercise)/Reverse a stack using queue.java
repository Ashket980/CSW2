
import java.util.*;
public class sttttttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ss=new Stack<>();
		ss.add(1);
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(5);
		ArrayDeque <Integer>qq=new ArrayDeque<>();
		System.out.println(ss.peek());
		System.out.println(ss);
		while(!(ss.isEmpty()))
			qq.add(ss.pop());
		while(!(qq.isEmpty()))
			ss.push(qq.remove());
		System.out.println(ss);
		
	}

}
