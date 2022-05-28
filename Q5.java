import java.io.*;
import java.util.*;

public class Q5
{
    private int V;                             
    private LinkedList<Integer> adj[];             
    private Queue<Integer> queue;                  
 
    Q5(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

 
    void addEdge(int v,int w)
    {
        adj[v].add(w);                         
    }
 
    void BFS(int n)
    {

        boolean nodes[] = new boolean[V];       
        int a = 0;
 
        nodes[n]=true;                  
        queue.add(n);                
 
        while (queue.size() != 0)
        {
            n = queue.poll();           
            System.out.print(n+" ");     
 
            for (int i = 0; i < adj[n].size(); i++)  
            {
                a = adj[n].get(i);
                if (!nodes[a])                  
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }  
        }
    }

    public static void main(String args[])
    {
        Q5 graph = new Q5(6);
 
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);
 
        System.out.println("The Breadth First Traversal of the graph is as follows :");
 
        graph.BFS(0);
    }
}