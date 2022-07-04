import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
 
class GFG {
    int val;
    int steps;
 
    public GFG(int val, int steps)
    {
        this.val = val;
        this.steps = steps;
    }
}
 
public class GeeksForGeeks {
    private static int minOperations(int src, int target)
    {
 
        Set<GFG> visited = new HashSet<>(1000);
        LinkedList<GFG> queue = new LinkedList<GFG>();
 
        GFG node = new GFG(src, 0);
 
        queue.offer(node);
        visited.add(node);
 
        while (!queue.isEmpty()) {
            GFG temp = queue.poll();
            visited.add(temp);
 
            if (temp.val == target) {
                return temp.steps;
            }
 
            int mul = temp.val * 2;
            int sub = temp.val - 1;
 
            // given constraints
            if (mul > 0 && mul < 1000) {
                GFG nodeMul = new GFG(mul, temp.steps + 1);
                queue.offer(nodeMul);
            }
            if (sub > 0 && sub < 1000) {
                GFG nodeSub = new GFG(sub, temp.steps + 1);
                queue.offer(nodeSub);
            }
        }
        return -1;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        // int x = 2, y = 5;
        int x = 4, y = 7;
        GFG src = new GFG(x, y);
        System.out.println(minOperations(x, y));
    }
}

// import java.io.*;
 
// class GFG
// {
//     static int minOperations(int x, int y)
//     {
       
//         // If both are equal then return 0
//         if (x == y)
//             return 0;
 
//         // Check if conversion is possible or not
//         if (x <= 0 && y > 0)
//             return -1;
 
//         // If x > y then we can just increase y by 1
//         // Therefore return the number of increments
//         // required
//         if (x > y)
//             return x - y;
 
//         // If last bit is odd
//         // then increment y so that we can make it even
//         if (y % 2 != 0)
//             return 1 + minOperations(x, y + 1);
 
//         // If y is even then divide it by 2 to make it
//         // closer to x
//         else
//             return 1 + minOperations(x, y / 2);
//     }
 
//     public static void main(String[] args)
//     {
//         System.out.println(minOperations(4, 7));
//     }
// }
