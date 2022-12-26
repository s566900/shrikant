package Test;

import java.util.*;

public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter a String ");
        String frist = sc.nextLine();
        char[] arr = frist.toCharArray();
        String second = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                second = second + arr[i];
            }
        }
        System.out.println("the string after remove spaces is: " + second);
        sc.close();
    }

}
