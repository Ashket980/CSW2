public class Q2 {
 
    static class Node {
        int data;
        Node next;
    };
 
    static Node newNode(int l)
    {
        Node temp = new Node();
        temp.data = l;
        temp.next = null;
        return temp;
    }
 
    static void print(Node node)
    {
        while (node != null) {
            System.out.print("" + node.data);
            node = node.next;
        }
    }
 
    static Node merge(Node h1, Node h2)
    {
        if (h1 == null)
            return h2;
        if (h2 == null)
            return h1;
 
        if (h1.data < h2.data) {
            h1.next = merge(h1.next, h2);
            return h1;
        }
        else {
            h2.next = merge(h1, h2.next);
            return h2;
        }
    }
 
    public static void main(String args[])
    {
        Node h1 = newNode(1);
        h1.next = newNode(3);
        h1.next.next = newNode(5);
 
       
        Node h2 = newNode(0);
        h2.next = newNode(2);
        h2.next.next = newNode(4);
 
     
 
        Node mergedhead = merge(h1, h2);
 
        print(mergedhead);
    }
}
