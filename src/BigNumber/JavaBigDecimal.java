package BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String s[] = new String[n + 2]; // в задаче n+2

        for (int i = 0; i < n; i++) {
            s[i] = scan.nextLine();
        }

        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {

            @Override
            public int compare(String a1, String a2) {
                if (a1 != null && a2 != null) {
                    BigDecimal a = new BigDecimal(a1);
                    BigDecimal b = new BigDecimal(a2);
                    return a.compareTo(b);
                } else return 0;
            }
        }));

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}