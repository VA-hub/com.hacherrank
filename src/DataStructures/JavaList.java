package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List <Integer> list = new LinkedList<>();  // создаем динамический массив целых чисел ()

        for (int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++){
            String str = scan.next();
            if (str.equals("Insert")){
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else if (str.equals("Delete")){
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();

        for (int item : list){
            System.out.print(item + " ");
        }
    }
}
