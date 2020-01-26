package Java30d;

import java.util.Scanner;

public class InheritanceDay12 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String firstName = "Vitalii";
        String lastName = "Aleksandrov";
        int id = 7;
        int arr[] = {100,80};

        Student va = new Student("Vitaly","Aleksandrov",1, arr);
        System.out.println(va.averageScale());

    }
}

class Person{
    protected String firstName;
    protected String lastName;
    protected int id;
    protected int Age;

    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

}

class Student extends Person{
    private String firstName;
    private String lastName;
    private int id;
    private int [] scores;

    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id); // конструктор родительского класса Person
        this.scores = scores;
    }

    char averageScale (){
        int averageGrade = 0;
        double sum = 0;
        char mark = '5';
        for (int i = 0; i < scores.length; i++) {
            sum = scores[i] + sum;
        }

        averageGrade = (int)(sum / scores.length);

            if (averageGrade >= 90 & (averageGrade <=100)) mark = 'O';
            if (averageGrade >= 80 & (averageGrade < 90)) mark = 'E';
            if (averageGrade >= 70 & (averageGrade < 80)) mark = 'A';
            if (averageGrade >= 55 & (averageGrade < 70)) mark = 'P';
            if (averageGrade >= 40 & (averageGrade < 55)) mark = 'D';
            if (averageGrade < 40) mark = 'T';
        return mark;
    }
}
