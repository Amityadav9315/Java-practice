import java.util.*;
public class NearestCourt {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                int y=sc.nextInt();
                int z=(x+y)/2;
                int c=x-z;
                int d=y-z;
                int max=Math.max(c,d);
                System.out.println(max);

                // your code goes here

            }
        }



