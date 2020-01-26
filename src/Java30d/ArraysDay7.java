package Java30d;

import java.util.Scanner;

public class ArraysDay7 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\\r\\n|[\\n\\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        scanner.close();

        for (int i = 0; i < arrItems.length; i++) {
            System.out.println(i + ": " + arrItems[i]);
        }

        for (int j = n - 1; j >= 0; j--) {
            System.out.println(arr[j]);
        }

        for (int k = arrItems.length-1; k >= 0; k--) {
            System.out.print(arrItems[k] + " ");
        }


    }
}
