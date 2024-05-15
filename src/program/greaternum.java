import java.lang.*;
import java.util.*;
public class greaternum {
    //if elseif condition

    public static void max() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter  the value of b");
        int b = sc.nextInt();
        System.out.println("Enter  the value of c");
        int c = sc.nextInt();

        if (a==b||b==c||a==c) {
            System.out.println("equal");

        } else if (a > b && a > c)
            System.out.println("a is greater");
        else if (a < b && c < b)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");

    }

    public static void exit() {
        System.out.println("stop operation");
        System.exit(0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the OPERATION");
        String str = sc.next();
        do {
            switch (str) {
                case "max":
                    max();
                    System.out.println("Enter the OPERATION");
                    str = sc.next();
                    break;
                case "exit":
                    exit();
                    System.out.println("Enter the OPERATION");
                    str = sc.next();
                    //return;
                    break;
            }

        }
        while (true);
    }
}
