import java.util.Scanner;

public class Backtracking_AllNQueenSolution
{
    static int c=0;
    static boolean isValid(int br[][],int i,int j,int n)
    {
        boolean b1=i<n&&j<n&&i>=0&&j>=0&&br[i][j]==0;
        for(int k=0;k<n;k++)
        {
            if(br[i][k]==1)
                return false;
        }
        for (int l = i, m = j; l >= 0 && m >= 0; l--, m--)
        {
            if (br[l][m] == 1)
            {
                return false;
            }
        }
        for (int l = i, m = j; m >= 0 && l < n; l++, m--)
        {
            if (br[l][m] == 1)
            {
                return false;
            }
        }
        return b1;
    }
    static void solve(int br[][],int n,int i,int j)
    {
        if(j==n)
        {
            print(br,n);
            return;
        }
        for(int k=i;k<n;k++)
        {
            if (isValid(br, k, j, n))
            {
                br[k][j] = 1;
                solve(br, n, 0, j + 1);
                //backtracking
                br[k][j] = 0;

            }
        }
    }
    static void print(int br[][],int n)
    {
        c++;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%-3d",br[i][j]);
            }
            System.out.println();
        }
        System.out.println("====================================");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int br[][]=new int[n][n];
        solve(br,n,0,0);
        if(c==0)
        {
            System.out.println("No Solution");
        }
        else
        {
            System.out.println(c+"  Solutions");
        }

    }
}
