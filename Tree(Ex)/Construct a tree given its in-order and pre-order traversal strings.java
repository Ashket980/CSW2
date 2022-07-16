import java.io.*;
import java.util.*;
 
class Node
{
  char data;
  Node left,right;
  Node(char item)
  {
    data = item;
    left = right = null;
  }
}
public class Q1
{
 
  public static Node root;
 
  static HashMap<Character,Integer> mp = new HashMap<>();
  static int preIndex = 0;
  public static Node buildTree(char[] in, char[] pre, int inStrt, int inEnd)
  {
 
    if(inStrt > inEnd)
    {
      return null;
    }
 
    char curr = pre[preIndex++];
    Node tNode;
    tNode = new Node(curr);
 
    if (inStrt == inEnd)
    {
      return tNode;
    }
 
    int inIndex = mp.get(curr);
 
    tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
    tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
    return tNode;
  }
 
  public static Node buldTreeWrap(char[] in, char[] pre, int len)
  {
    for(int i = 0; i < len; i++)
    {
      mp.put(in[i], i);
    }
    return buildTree(in, pre, 0, len - 1);
  }
 
  static void printInorder(Node node)
  {
    if(node == null)
    {
      return;
    }
    printInorder(node.left);
    System.out.print(node.data + " ");
    printInorder(node.right);
  }
 
  public static void main (String[] args)
  {
    char[] in = {'D', 'B', 'E', 'A', 'F', 'C'};
    char[] pre = {'A', 'B', 'D', 'E', 'C', 'F'};
    int len = in.length;
 
    Q1.root=buldTreeWrap(in, pre, len);
 
    System.out.println("Inorder traversal of the constructed tree is");
    printInorder(root);
  }
}
