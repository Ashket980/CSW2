public class Q19 {
 
    static class Node {
        int data;
        Node left, right;
    }
 
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.left = null;
        temp.right = null;
        temp.data = key;
        return temp;
    }
 
    static Node insert(Node root, int key)
    {
        if (root == null)
            return newNode(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }
 
    static int floor(Node root, int key)
    {
        if (root == null)
            return Integer.MAX_VALUE;
 
        if (root.data == key)
            return root.data;
 
        if (root.data > key)
            return floor(root.left, key);
 
        int floorValue = floor(root.right, key);
        return (floorValue <= key) ? floorValue : root.data;
    }
 
    public static void main(String[] args)
    {
        Node root = null;
        root = insert(root, 7);
        insert(root, 10);
        insert(root, 5);
        insert(root, 3);
        insert(root, 6);
        insert(root, 8);
        insert(root, 12);
        System.out.println(floor(root, 9));
    }
}
