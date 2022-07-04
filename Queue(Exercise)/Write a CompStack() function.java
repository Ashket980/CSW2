import java.util.*;

public class Q6 {
	
static boolean isSameStack(Stack<String> stack1,
                            Stack<String> stack2)
{
    boolean flag = true;
 
    if (stack1.size() != stack2.size())
    {
        flag = false;
        return flag;
    }
 
    while (stack1.empty() == false)
    {
        if (stack1.peek() == stack2.peek())
        {
            stack1.pop();
            stack2.pop();
        }
        else
        {
            flag = false;
            break;
        }
    }
 
    return flag;
}

	public static void main(String arr[]) {
		Stack<String> stack1 = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		
		stack1.push("A");
		stack1.push("B");
		stack1.push("C");
		stack1.push("D");
		stack1.push("E");
		
		stack2.push("A");
		stack2.push("B");
		stack2.push("C");
		stack2.push("D");
		stack2.push("E");

		if (isSameStack(stack1, stack2))
			System.out.println("Stacks are Same");
		else
			System.out.println("Stacks are not Same");

	}
}
