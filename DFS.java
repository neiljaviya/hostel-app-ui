import java.util.Scanner;
public class DFS 
{
	public static int[][] G = new int[5][5];
	public static int[] visited = new int[5];
	static int n;
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of vertex:");
		n = input.nextInt();
		System.out.print("enter matrix:");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				G[i][j] = input.nextInt();
			}
		}
		for(int i=0 ; i<n ; i++)
		{
			visited[i] = 0;
		}
		
		dfs(0);
	}
	public static void dfs(int i)
	{
		visited[i] = 1;
		System.out.println(i);
		for(int j = 0; j < n; j++)
		{
			if(G[i][j] == 1 && visited[j] == 0)
			{
				dfs(j);
			}
		}
	}
}