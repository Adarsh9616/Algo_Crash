import java.util.Scanner;

public class CoinGame
{
    static int solve(int ar[],int l,int r)
    {
        if(l+1==r)
        {
            return Math.max(ar[l],ar[r]);
        }
        return Math.max(ar[l]+Math.min(solve(ar,l+1,r-1),solve(ar,l+2,r)),
                ar[r]+Math.min(solve(ar,l+1,r-1),solve(ar,l,r-2)));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(solve(ar,0,ar.length-1));
    }
}
