import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class SecongLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        if ((a > b || a > c) && (a < b || a < c)) {
            System.out.println(a);
        } else if ((b > a || b > c )&&( b < a || b < c) ){
            System.out.println(b);
        } else if ((c > a || c > b) && (c < a || c < b)) {
            System.out.println(c);
        }

    }
}
