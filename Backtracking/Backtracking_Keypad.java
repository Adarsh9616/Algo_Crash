import java.util.ArrayList;
import java.util.Scanner;

public class Backtracking_Keypad
{
    static String ar[]={" ","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    static ArrayList<String> solve(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> empty=new ArrayList<>();
            empty.add("");
            return empty;
        }

        String sub=s.substring(1);
        ArrayList<String> small=solve(sub);
        ArrayList<String> big=new ArrayList<>();
        int k=Character.getNumericValue(s.charAt(0));
        String ss=ar[k];
        for(int i=0;i<ss.length();i++)
        {
            for(String sss:small)
            {
                big.add(""+ss.charAt(i)+sss);
            }
        }
        return big;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> aa=new ArrayList<>();
        aa=solve(s);
        for(String ss:aa)
        {
            System.out.print(ss+" ");
        }
    }
}

