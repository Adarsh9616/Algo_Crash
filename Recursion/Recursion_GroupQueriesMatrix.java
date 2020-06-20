import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_GroupQueriesMatrix
{
    static int solve(int ar[][],int i,int j,int n)
    {
        if(i<0||j<0||i>=n||j>=n)
        {
            return 0;
        }
        if(ar[i][j]==0)
        {
            return 0;
        }
        ar[i][j]=0;
        int size=1;
        size+=solve(ar,i+1,j,n);
        size+=solve(ar,i-1,j,n);
        size+=solve(ar,i,j+1,n);
        size+=solve(ar,i,j-1,n);
        return size;

    }
    static void solve(int ar[][],int n,ArrayList<Integer> a)
    {
        ArrayList<Integer> l=new ArrayList<>();
        for(int e:a)
        {
            int aa[][]=new int[n][n];
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++)
                    aa[i][j]=ar[i][j];

            int count=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(ar[i][j]==1)
                    {
                        int size = solve(aa, i, j, n);
                        if (e == size)
                        {
                            count++;
                        }
                    }
                }
            }
            l.add(count);
        }
        for(int e:l)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("Please enter 5 Queries");
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            int k=sc.nextInt();
            a.add(k);
        }

        solve(ar,n,a);
    }
}
