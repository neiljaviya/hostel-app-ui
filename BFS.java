import java.util.*;
public class BFS
{
	public static void main(String[] args)
	{
		int G[][] = {{0,1,1,0,0},
					{0,0,0,1,1},
					{0,0,0,0,0},
					{0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0}};
	System.out.println("BFS of graph is:");
	BFsearch(G);
	}
	
	public static void BFsearch(int[][] G)
	{
		int [] mark = new int[G[0].length];
		for(int i=0;i<mark.length;i++)
		{
			mark[i] = 0;
		}
		for(int i=0;i<mark.length;i++)
		{
			if(mark[i] != 1)
			{
				findBFS(i,mark,G);
			}
		}
	}
	
	public static void findBFS(int v,int[] mark,int[][] G)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		HashMap<Integer,String> dict = new HashMap<Integer,String>();
		dict.put(0,"A");
		dict.put(1,"B");
		dict.put(2,"C");
		dict.put(3,"D");
		dict.put(4,"E");
		dict.put(5,"F");
		dict.put(6,"G");
		
		mark[v] = 1;
		q.add(v);
		
		while(!q.isEmpty())
		{
			int u = q.element();
			System.out.print(dict.get(u)+" ");
			q.remove();
			for(int i=0;i<G[1].length;i++)
			{
				if(G[u][i] == 1)
				{
					if(mark[i] == 0)
					{
						mark[i] = 1;
						q.add(i);
					}
				}
			}
		}
	}
}