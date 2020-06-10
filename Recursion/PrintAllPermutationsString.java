import java.util.Scanner;

public class PrintAllPermutationsString
{
    static String swap(String s,int l,int r)
    {
        char c[]=s.toCharArray();
        char t=c[l];
        c[l]=c[r];
        c[r]=t;
        return String.valueOf(c);
    }
    static void solve(String s,int l,int r)
    {
        if(l==r)
        {
            System.out.println(s);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            s=swap(s,l,i);
            solve(s,l+1,r);
            s=swap(s,l,i);//backtrack
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        solve(s,0,s.length()-1);
    }
}
