package recursion;

public class adjacentDuplicates {

    static String solve(String s){

        if( s.length()== 0){
            return "";
        }

     char m = s.charAt(0);
        String ans = solve(s.substring(1));
        if(m == ans.charAt(0)){
            return ans;
        }
        return (m+ans);
    }


    public static void main(String[] args) {
        String s = "aaaabbbbbcccddddeeeefff";
        System.out.println(solve(s));
  }
}
