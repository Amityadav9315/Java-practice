import java.util.*;
public class ChessPairing {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int x=sc.nextInt();
                int ur=2*n-x;
                int r=x-ur;
                if(r>0){
                    System.out.println(r);

                }
                else{
                    System.out.println("0");
                }
                // your code goes here

            }
        }



