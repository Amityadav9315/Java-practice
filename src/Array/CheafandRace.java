import java.util.*;
public class CheafandRace {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
                int y=sc.nextInt();
                int a=sc.nextInt();
                int b=sc.nextInt();
                if((x==a||x==b)&&(y==a||y==b)){
                    System.out.println("0");
                }
                else if((x==a||x==b)&&(y!=a||y!=b)){
                    System.out.println("1");
                }
                else if((y==a||y==b)&&(x!=a||x!=b)){
                    System.out.println("1");
                }
                else {
                    System.out.println("2");
                }
            }
            // your code goes here

        }



