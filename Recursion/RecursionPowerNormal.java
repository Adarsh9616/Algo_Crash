import java.util.Scanner;
//O(N) complexity
public class RecursionPowerNormal
{
    static long pow(long a,long b)
    {
        if(b==0)
        {
            return 1;
        }
        return a*pow(a,b-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(pow(a,b));
    }
}
