package Java30d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetsReviewDay6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        String[] list = new String[t];

        for (int i = 0; i < t; i++) {
            list[i] = scan.next();
        }

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < list[i].length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(list[i].charAt(j));
                }
            }
            System.out.print(" ");
            for (int k = 0; k < list[i].length(); k++) {
                if (k % 2 > 0) {
                    System.out.print(list[i].charAt(k));
                }
            }
            System.out.println();
        }
    }
}
