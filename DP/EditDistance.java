package DP;
import java.util.*;
import java.lang.*;


public class EditDistance {

    // edit distance dynammic programming
    static int editDistance(String s1, String s2 ,int[][] dp  ){
        int n1  = s1.length();
        int n2 = s2.length();

        for (int i = 0; i <= n1; i++) {
            for (int j = 0; j <= n2; j++) {
                if(i == 0 && j == 0 ){
                    dp[i][j] = 0;
                }else if(i == 0 && j >0){
                    dp[i][j] = dp[i][j-1] + 1;
                }else if(j ==0 && i>0 ){
                    dp[i][j] = dp[i-1][j] +1;
                }else if(i > 0 && j>0){
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }else{
                      int ans = Math.min(dp[i][j-1], dp[i-1][j]);
                       dp[i][j] = Math.min(ans, dp[i-1][j-1]) +1;
                    }
                }
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
        return dp[n1][n2];
    }


    // MAIN MEATHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1  =sc.nextLine();
        String str2  =sc.nextLine();

        int[][] dp = new int[str1.length()+1][str2.length()+1];
        System.out.println( editDistance(str1 ,str2 ,dp));

    }
}
