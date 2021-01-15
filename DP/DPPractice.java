package DP;

import java.util.Arrays;
import java.util.Scanner;

public class DPPractice {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int dp[] = new int[100];
        Arrays.fill(dp , -1);
            int n = sc.nextInt();
            int k = 3;
        System.out.println(ways(n ,dp ));
        System.out.println(bottomup(n , k));
    }


    static int ways(int n , int[] dp){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(dp[n] !=  -1){
            return dp[n];
        }else{
            dp[n] = ways(n-1, dp)+ ways(n-2, dp) + ways(n-3, dp);
            return dp[n];
        }


    }

    // this is bottom up approach O(n*k)
    static int bottomup(int n , int k){
        int[] dp= new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <=n ; i++) {
            dp[i] = 0;
            for (int j = 1; j <=k && i-j>0; j++) {
                dp[i] += dp[i-j];
            }
        }
        return dp[n];

    }
    // we can change this to O(n) with the help of the (written in notebook)
}
