import java.util.Scanner;

public class RecursionPowerFast
{
    static long pow(long a,long b)
    {
        if(b==0)
        {
            return 1;
        }
        if(b%2==0)
        {
            return pow(a*a,b/2);
        }
        else
        {
            return a*pow(a*a,b/2);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(pow(a,b));
    }
}
