import java.util.ArrayList;
import java.util.Scanner;

public class Backtracking_PrintWaysOfFactorisation
{
    static ArrayList<ArrayList<Integer>> solve(int n)
    {
        ArrayList<ArrayList<Integer>> big=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> small =new ArrayList<Integer>();
        solve(2,1,n,big,small);
        return big;

    }
    static void solve(int e, int m, int n, ArrayList<ArrayList<Integer>> big, ArrayList<Integer> small)
    {
        if(e>n||m>n)
        {
            return;
        }
        if(m==n)
        {
            ArrayList<Integer> t=new ArrayList<>(small);
            big.add(t);
            return;
        }
        for(int i=e;i<n;i++)
        {
            if(i*e>n)
            {
                break;
            }

            if(n%i==0)
            {
                small.add(i);
                solve(i,m*i,n,big,small);
                //backtracking
                small.remove(small.size()-1);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> ans=solve(n);
        for(ArrayList<Integer> e:ans)
        {
            for(int a:e)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }



    }
}
