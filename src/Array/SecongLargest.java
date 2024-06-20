import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class SecongLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        if (a > max) {
            max = a;
            if (b > max) {
                max = b;
            }
            if(c>max){
                max=c;
            }
        }
        System.out.println(max);

    }

}
