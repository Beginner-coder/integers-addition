import java.util.*;
class Graph
{
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }
    void BFS(int s)
    {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number of vertices ");
        int v =inp.nextInt();
        System.out.println("Enter vertices having edge between them i.e. 1 2 or 2 3 ....");
        Graph g = new Graph(v);
        while(inp.hasNextLine()){
            String c=inp.next();
            if(c.equals("n")){
                break;
            }
            int a=Integer.parseInt(c);
            int b=inp.nextInt();
            g.addEdge(a,b);
        }
        System.out.println("Enter starting vertex ");
        int start=inp.nextInt();

        System.out.format("BFS traversal starting from vertex %d is \n",start);
        g.BFS(start);
    }
}