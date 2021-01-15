import javax.imageio.stream.ImageInputStreamImpl;
import java.util.*;
import java.lang.*;
import java.io.*;

public class practice {
    static int fibonacciDP(int n ,int[] dp){
        if(n == 1 || n==0){
            dp[n] = n;
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        else{
            dp[n] = fibonacciDP(n-1, dp) + fibonacciDP(n-2, dp);
            return dp[n];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {


            int n = sc.nextInt();

            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);

            System.out.println(fibonacciDP(n, dp));


        }
    }

}
