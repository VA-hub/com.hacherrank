package Java30d;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Recursion3Day9
{

        static int factorial(int n)
        {
            int res = 0;

                if (n == 1 || n == 0){
                    return n;
                }
                res = n * factorial(n-1);

            return res;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException
        {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("TEST" +  +"test.txt")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = factorial(n);

            System.out.println(result);
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();

            //bufferedWriter.close();

            scanner.close();
        }

}
