import java.util.Scanner;

public class Backtracking_AllKnightMoves
{
    static int c=0;
    static boolean isValid(int br[][],int n,int i,int j)
    {
        return i<n&&j<n&&i>=0&&j>=0&&br[i][j]==0;
    }
    static void printBoard(int br[][],int n)
    {
        c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%-5d",br[i][j]);
            }
            System.out.println();
        }
    }
    static boolean solve(int br[][],int n,int moves,int i, int j)
    {
        if(moves==n*n)
        {
            printBoard(br,n);
            System.out.println("===============================");
            return true;
        }
        int rowMove[]={-1,-2,-2,-1,+1,+2,+2,+1};
        int colMove[]={+2,+1,-1,-2,-2,-1,+1,+2};
        for(int r=0;r<8;r++)
        {
            int ni=i+rowMove[r];
            int nj=j+colMove[r];
            if(isValid(br,n,ni,nj))
            {
                br[ni][nj] = moves + 1;
                boolean isSuccesful = solve(br, n, moves + 1, ni, nj);
                //backtrack
                br[ni][nj] = 0;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Board");
        int n=sc.nextInt();
        int br[][]=new int[n][n];
        br[0][0]=1;
        if(!solve(br,n,1,0,0)&&c==0)
        {
            System.out.println("No solution");
        }
    }
}

