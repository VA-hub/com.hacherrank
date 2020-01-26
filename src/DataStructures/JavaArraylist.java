package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // массив размерностью n из динамических массивов
        int n = scan.nextInt();
        int d,q,x,y = 0;
        ArrayList[] set = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            d = scan.nextInt();
            set[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                set[i].add(Integer.valueOf(scan.nextInt()));
            }
            System.out.println();
        }

        q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            try {
                System.out.println(set[x-1].get(y-1)); // массивы с 0
            } catch (Exception e){
                System.out.println("ERROR");
            }

        }
    }
}
