import java.util.Scanner;

public class PrintSubsequenceString
{
    static void solve(String input,String output)
    {
        if(input.length()==0)
        {
            System.out.println(output);
            return;
        }
        //do not taking character in account
        solve(input.substring(1),output);
        //taking character in account
        solve(input.substring(1),(output+input.charAt(0)));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        solve(s,"");
    }

}
