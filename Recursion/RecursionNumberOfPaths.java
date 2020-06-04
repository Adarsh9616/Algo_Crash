import java.util.Scanner;

public class RecursionNumberOfPaths
{
    static int solve(int n,int m)
    {
        if(n==1)
        {
            return 1;
        }
        if(m==1)
        {
            return 1;
        }
        return solve(n-1,m)+solve(n,m-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(solve(n,m));
    }
}
