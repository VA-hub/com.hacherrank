package Java30d;

/**
 * посмотреть потом через побитовые операции
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinaryNumbersDay8 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String str = Integer.toBinaryString(n);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String [] array = str.split("0+");
        int [] arrLength = new int[array.length];
        System.out.println(str);
        for (int i = 0; i < array.length; i++) {
            arrLength[i] = array[i].length();
            System.out.println(i + " (" + array[i] + ")" + " : " + arrLength[i]);

        }
        System.out.println("Длина массива = " + array.length);
        Arrays.sort(arrLength);

        System.out.println(arrLength[arrLength.length-1]);

        scanner.close();
    }
}
