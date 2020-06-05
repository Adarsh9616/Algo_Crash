import java.util.Arrays;
import java.util.Scanner;

public class RecursionSubsequenceString
{
    static String[] solve(String s)
    {
        if(s.length()==0)
        {
            return new String[]{""};
        }
        String sans[]=solve(s.substring(1));
        String ans[]=new String[sans.length*2];
        for(int i=0;i<sans.length;i++)
        {
            ans[i]=sans[i];
        }
        for(int i=0;i<sans.length;i++)
        {
            ans[i+sans.length]=s.charAt(0)+sans[i];
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Arrays.toString(solve(s)));
    }
}
