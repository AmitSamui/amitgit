package DP;
import java.util.*;
import java.lang.*;
import java.io.*;

public class KnapSackProblem {

    // this is done with the help of the recurssion without the DP
    static int knapSack(int[] weight, int[] prices , int n , int w){

        if(n == 0 || w == 0){
            return 0;
        }
        int inc = 0 , exc =0;

        if(weight[n-1] <= w ){
            inc = prices[n-1] + knapSack(weight , prices , n-1 , w-weight[n-1]);
        }
        exc =  knapSack(weight , prices , n-1 , w);

        return Math.max(inc , exc);
    }


    // this is the knapsack done by DP
    static  int topDown(int[] weight, int[] prices , int n , int w , int[][] dp) {
        if (n == 0 || w == 0) {
            dp[n][w] = 0;
            return 0;
        }
        int inc = 0, exc = 0;
        if (dp[n][w] != -1) {
            return dp[n][w];
        } else {
            if (weight[n - 1] <= w) {
                inc = prices[n - 1] + knapSack(weight, prices, n - 1, w - weight[n - 1]);
            } exc = knapSack(weight, prices, n - 1, w);
        }
        dp[n][w] = Math.max(inc ,exc);

        return dp[n][w];
    }

    





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight[] = {2, 3 , 5 ,7};// this is the weight of the things
        int prices[] = {10, 20 ,15, 5};  // this is the price of the things
        int n = sc.nextInt(); // this is the number of items
        int w = sc.nextInt(); // this is the weight tolerance of the sack
        int[][] DP = new int[n+1][n+1];
        Arrays.fill(DP, -1);

        System.out.println(topDown(weight , prices , n , w , DP));


    }
}
