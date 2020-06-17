import java.util.Scanner;

public class Backtracking_ShortestPathInMaze
{
    static int solve(int a[][],int i,int j,int x,int y)
    {
        int rows=a.length;
        int cols=a[0].length;
        boolean vis[][]=new boolean[rows][cols];
        return solve(a,i,j,x,y,vis);
    }
    static boolean isValid(int a[][],int i,int j,boolean vis[][])
    {
        int rows=a.length;
        int cols=a[0].length;
        return (i>=0 && j>=0 && i<rows && j<cols && a[i][j]==1 && !vis[i][j]);
    }
    static int solve(int a[][],int i,int j,int x,int y,boolean vis[][])
    {
        if(!isValid(a,i,j,vis))
        {
            return 1000000;
        }
        if(i==x&&j==y)
        {
            return 0;
        }
        vis[i][j]=true;

        int l=solve(a,i,j-1,x,y,vis)+1;
        int m=solve(a,i,j+1,x,y,vis)+1;
        int n=solve(a,i+1,j,x,y,vis)+1;
        int o=solve(a,i-1,j,x,y,vis)+1;
        //Backtracking;
        vis[i][j]=false;
        return Math.min(Math.min(l,m),Math.min(n,o));

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][] =
                {
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
                        { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
                        { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
                        { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                        { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
                };

        int i=sc.nextInt();
        int j=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();

        int result=solve(a,i,j,x,y);
        if(result>=1000000)
        {
            System.out.println("No path Possible");
        }
        else
        {
            System.out.println(result);
        }
    }
}
