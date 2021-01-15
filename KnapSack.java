import java.util.*;
import java.lang.*;


public class KnapSack {

//    static int bottomup(int[] weights, int[] prices ,int[][] dp, int w){
//        for (int i = 1; i <= weights.length; i++) {
//
//            for (int j = 1; j <= w; j++) {
//                int inc = 0;
//                int exc = dp[i - 1][j];
//                if(j >=  weights[i-1]   ){
//                    inc = prices[i-1] + dp[i-1][j-weights[i-1]];
//                }
//                dp[i-1][j-1] = Math.max(inc , exc);
//            }
//        }
//        return dp[weights.length][w];
//
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//
//       // input files
//        int[] weights = {1,3,4,6};
//        int[] prices = {20, 30 , 10, 50};
//        int w = 10;
//        int n = weights.length;
//
//
//
//        int[][] dp = new int[100][100];
//        for (int r = 0; r < w + 1; r++) {
//            dp[0][r] = 0;
//        }
//        for (int c = 0; c < n + 1; c++) {
//            dp[c][0] = 0;
//        }
//        System.out.println(bottomup(weights,prices, dp ,w));
//
//    }
public static void main(String args[]) {
    int w = 10;
    int n = 4;
    int[] val = {20, 30 , 10, 50};
    int[] wt = {1,3,4,6};

    // Populate base cases
    int[][] mat = new int[n + 1][w + 1];
    for (int r = 0; r < w + 1; r++) {
        mat[0][r] = 0;
    }
    for (int c = 0; c < n + 1; c++) {
        mat[c][0] = 0;
    }

    // Main logic
    for (int item = 1; item <= n; item++) {
        for (int capacity = 1; capacity <= w; capacity++) {
            int maxValWithoutCurr = mat[item - 1][capacity]; // This is guaranteed to exist
            int maxValWithCurr = 0; // We initialize this value to 0

            int weightOfCurr = wt[item - 1]; // We use item -1 to account for the extra row at the top
            if (capacity >= weightOfCurr) { // We check if the knapsack can fit the current item
                maxValWithCurr = val[item - 1]; // If so, maxValWithCurr is at least the value of the current item

                int remainingCapacity = capacity - weightOfCurr; // remainingCapacity must be at least 0
                maxValWithCurr += mat[item - 1][remainingCapacity]; // Add the maximum value obtainable with the remaining capacity
            }

            mat[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr); // Pick the larger of the two
        }
    }

    System.out.println(mat[n][w]); // Final answer
    System.out.println(Arrays.deepToString(mat)); // Visualization of the table
}
}
