package DataStructures;

import java.util.Scanner;

public class JavaSubarrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int [] arr = new int[length];
        int res = 0;
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
            int s = arr[i];
            if (s < 0){
                res++;
            }
            for (int j = i; j >= 0; j--) {
                s = arr[j] + s;
                if (s < 0){
                    res++;
                }
            }

        }
        System.out.println(res);
    }
}
