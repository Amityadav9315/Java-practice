import java.util.*;
public class OlympicRanking {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
                int g1=sc.nextInt();
                int s1=sc.nextInt();
                int b1=sc.nextInt();
                int g2=sc.nextInt();
                int s2=sc.nextInt();
                int b2=sc.nextInt();
                int c=g1+b1+s1;
                int d=g2+b2+s2;
                if(c>d){
                    System.out.println("1");
                }
                else{
                    System.out.println("2");
                }
            }
            // your code goes here

        }



