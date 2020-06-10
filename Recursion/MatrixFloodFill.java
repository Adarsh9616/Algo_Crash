import java.util.Arrays;
import java.util.Scanner;

public class MatrixFloodFill
{
    static void solve(int ar[][],int r,int c,int toFill,int inplaceOf)
    {
        int row=ar.length;
        int col=ar[0].length;
        if(r<0||r>row-1||c<0||c>col-1)
        {
            return;
        }
        if(ar[r][c]!=inplaceOf)
        {
            return;
        }
        ar[r][c]=toFill;
        solve(ar,r+1,c,toFill,inplaceOf);
        solve(ar,r-1,c,toFill,inplaceOf);
        solve(ar,r,c+1,toFill,inplaceOf);
        solve(ar,r,c-1,toFill,inplaceOf);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
	                {1, 1, 1, 1, 1, 1, 0, 0},
	                {1, 0, 0, 1, 1, 0, 1, 1},
	                {1, 2, 2, 2, 2, 0, 1, 0},
	                {1, 1, 1, 2, 2, 0, 1, 0},
	                {1, 1, 1, 2, 2, 2, 2, 0},
	                {1, 1, 1, 1, 1, 2, 1, 1},
	                {1, 1, 1, 1, 1, 2, 2, 1},
	                };
        int r=sc.nextInt();
        int c=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        solve(a,r,c,x,y);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
