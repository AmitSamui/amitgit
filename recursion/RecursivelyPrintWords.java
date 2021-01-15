package recursion;

public class RecursivelyPrintWords {

    // recursion function
//    Given a list of word lists How to print all sentences possible taking one word from a list at a time via recursion?
//    Example:
//
//    Input: {{"you", "we"},
//        {"have", "are"},
//        {"sleep", "eat", "drink"}}
//
//    Output:
//    you have sleep
//    you have eat
//    you have drink
//    you are sleep
//    you are eat
//    you are drink
//    we have sleep
//    we have eat
//    we have drink
//    we are sleep
//    we are eat
//    we are drink

//        static String solution(String[][] s,int[] arr, int n , int i){
//
//            String ans = "";
//            if(n == s.length){
//
//            }
//
//        }


    public static void main(String[] args) {
            String[][] str = {{"you", "we"},
                    {"have", "are"},
                    {"sleep", "eat", "drink"}};
            int[] arr = new int[str.length];
        for (int i = 0; i < str.length ; i++) {
            arr[i] = str[i].length;

        }


    }
}
