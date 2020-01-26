package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // реализация через Stack - тоже устарела (современная реализация через ArrayDeque)
        Stack <String> stack = new Stack();


        String patternA1 = "\\{";
        String patternA2 = "\\}";
        String patternB1 = "\\(";
        String patternB2 = "\\)";
        String patternC1 = "\\[";
        String patternC2 = "\\]";
        int countA1 = 0;


        for (int i = 0; i < 10; i++) {
            stack.push(patternA1);
        }
        for (int i = 0; i < 5; i++) {
            stack.push(patternA2);
        }
        for (String s:stack)
        {
            if (stack.search(patternA1) > 0)
            {
                countA1++;
                System.out.println(stack.search(patternA1));
            }
        }

        System.out.println(countA1);

        /*
        // неэффективная реализация через String - replaceAll и регулярные выражения
        while (scan.hasNext()) {
            String input = scan.next();
            input = input.replaceAll("[^\\[\\]\\{\\}\\(\\)]", "").replaceAll("\\[\\]|\\{\\}|\\(\\)", "");
            System.out.println(input.isEmpty() + " input = " + input);
        }

         */
    }
}
