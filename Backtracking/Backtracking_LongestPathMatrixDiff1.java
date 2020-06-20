import java.util.Scanner;

public class Backtracking_LongestPathMatrixDiff1
{
    static int solve(int ar[][],int dp[][],int i,int j,int n)
    {
        if(i>=n||j>=n||i<0||j<0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int x = Integer.MIN_VALUE, y = Integer.MIN_VALUE, z = Integer.MIN_VALUE, w = Integer.MIN_VALUE;
        if (j < n - 1 && ((ar[i][j] + 1) == ar[i][j + 1]))
            x = dp[i][j] = 1 + solve(ar, dp, i, j+1,n);

        if (j > 0 && (ar[i][j] + 1 == ar[i][j - 1]))
            y = dp[i][j] = 1 + solve(ar, dp, i, j-1,n);

        if (i > 0 && (ar[i][j] + 1 == ar[i - 1][j]))
            z = dp[i][j] = 1 + solve(ar, dp, i-1, j,n);

        if (i < n - 1 && (ar[i][j] + 1 == ar[i + 1][j]))
            w = dp[i][j] = 1 + solve(ar, dp, i+1, j,n);

        return dp[i][j] = Math.max(x, Math.max(y, Math.max(z, Math.max(w, 1))));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[][] = new int[n][n];
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
                dp[i][j] = -1;
            }
        }
        int max = -1;
        for (int i = 0 ;i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == -1) {
                    solve(ar, dp, i, j, n);
                }
                max = Math.max(max, dp[i][j]);

            }

        }
        System.out.println(max);
    }
}
