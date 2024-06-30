import java.util.*;

public class BuyingnewTablet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int b = sc.nextInt();
            int maxArea = 0;

            for (int i = 0; i < n; i++) {
                int w = sc.nextInt();
                int h = sc.nextInt();
                int p = sc.nextInt();

                if (p <= b) {
                    int area = w * h;
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }

            if (maxArea > 0) {
                System.out.println(maxArea);
            } else {
                System.out.println("no tablet");
            }
        }
    }

