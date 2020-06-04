import java.util.Scanner;

public class RecursionPalindrome
{
    static String solve(String s)
    {
        if(s.length()==1)
        {
            return s;
        }
        return s.substring(s.length()-1,s.length())+solve(s.substring(0,s.length()-1));

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.equals(solve(s)));

    }
}
