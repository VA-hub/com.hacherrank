package Java30d;

import java.util.Scanner;

public class JavaOperatorsDay2 {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = 0, tax = 0, totalcost = 0;
        tip = meal_cost * (Double.valueOf(tip_percent)/100);
        tax = meal_cost * (Double.valueOf(tax_percent)/100);
        totalcost = meal_cost + tip + tax;

        System.out.println(Math.round(totalcost));
        System.out.println(tip);
        System.out.println(tax);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
