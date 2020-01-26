package Java30d;

import java.util.Scanner;

public class PersonDay4 {
    private int age;

    public PersonDay4(int initialAge) {
        this.age = initialAge;
        if (initialAge >= 0){
            this.age = initialAge;
        } else {
            this.age = 0;
        }
    }

    public void amIOld() {
        if (this.age >=0 & this.age < 13){
            System.out.println("You are young.");
        } else if (this.age >=13 & this.age < 18){
            System.out.println("You are teenager.");
        } else System.out.println("You are old.");
    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            PersonDay4 p = new PersonDay4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
