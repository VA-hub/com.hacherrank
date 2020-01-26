package DataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap <String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i < n ; i++)
        {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
            String s = in.nextLine();
            System.out.println(map.get(s));

    }
}
