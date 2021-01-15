import java.util.*;
import java.lang.*;


public class allpalindromicsubsequence {

    static Set<String> substring(String str){
        Set<String> st = new HashSet<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int j = n-1;
            while(i <= j){
                st.add(str.substring(i,j));
                j++;
            }
        }

        return st;
    }

    static int solution(String s){

        String[] arr = (String[]) substring(s).toArray();
        int count = 0;
        for (String value : arr) {
            if (ispalindrome(value)) {
                count++;
            }
        }
        return count;

    }

    static boolean ispalindrome(String s){
        int n = s.length();
        if(n==1){
            return true;
        }
        boolean isPalindrome = true;

            if(n%2 != 0){
                for (int i = 0; i < n/2; i++) {
                    if (s.charAt(i) != s.charAt(n - i - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
            }
        else if(n%2 == 0){
            for (int i = 0; i < (n/2)-1; i++) {
                if (s.charAt(i) != s.charAt(n - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
           int count =  solution(s);
        System.out.println(count);



    }
}
