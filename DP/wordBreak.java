package DP;

import java.util.*;
import java.lang.*;

public class wordBreak {
   static Map<String, Integer> dp = new HashMap<>();

    static int solve(String[] s, String b){
        int n = b.length();
        if(n == 0){
            return 1;
        }
        if(dp.get(b) != null){
            return dp.get(b);
        }
        for (int i = 0; i < b.length(); i++) {
            int flag = 0;
            String ss = b.substring(0 ,i);
            for (String value : s) {
                if (ss.compareTo(value) == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1 && solve(s, b.substring(i, n-1)) == 1 ){
                return  dp.put(b , 1);
            }
        }
        return dp.put(b, -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.println("enter string "+ i);
           arr[i] = sc.nextLine();
        }
        System.out.println("enter the b string");
        String b = sc.nextLine();

        int bool = solve(arr , b);
        if(bool == 1){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
