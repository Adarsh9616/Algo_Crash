import java.util.ArrayList;
import java.util.Scanner;

public class Backtracking_EqualSumPartition
{
    static boolean partition(int a[],int sum,int i,ArrayList<Integer> ans)
    {
        if(i>a.length||sum<0)
        {
            return false;
        }
        if(sum==0)
        {
            return true;
        }
        ans.add(a[i]);
        boolean leftPossible=partition(a,sum-a[i],i+1,ans);
        if(leftPossible)
        {
            return true;
        }
        ans.remove(ans.size()-1);
        return partition(a,sum,i+1,ans);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            sum+=ar[i];
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        boolean isPossible=(sum&1)==0&&partition(ar, (int) (sum/2),0,ans);
        if(isPossible)
        {
            for(int e:ans)
            {
                System.out.println(e+" ");
            }
        }
        else
        {
            System.out.println("Not Possible");
        }

    }
}
