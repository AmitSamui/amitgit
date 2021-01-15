
import java.util.*;
import java.lang.*;
import java.io.*;

public class MinOperation {

    static void rotateArr(char[] arr, int start, int end) {
        char temp = arr[end-1];
        for (int i = end - 1; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//
//
//        if (a.length() == b.length()) {
//            char[] arr1 = a.toCharArray();
//            char[] arr2 = b.toCharArray();
//
//            int n = a.length();
//            char[] arr3 = a.toCharArray();
//            Arrays.sort(arr3);
//            char[] arr4 = b.toCharArray();
//            Arrays.sort(arr4);
//            a = new String(arr3);
//            b = new String(arr4);
//
//
//            if (!a.equals(b)) {
//                System.out.println("no operations possible");
//                return;
//            } else {
//                int count = 0;
//
//                int i = n - 1;
//                while (i >= 0) {
//                    if (arr1[i] != arr2[i]) {
//                        rotateArr(arr2, 0, i);
//                        count++;
//                    } else {
//                        i--;
//                    }
//                }
//
//
//                System.out.println(count);
//            }
//
//        }

        String a = "amitsamui";
        String prefix = "amitfalui";
//        char[] arr1 = a.toCharArray();
//        char[] arr2 = b.toCharArray();
//        a = new String(arr1);
//        b = new String(arr2);


    }
}
