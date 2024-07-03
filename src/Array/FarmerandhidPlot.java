import java.util.*;
public class FarmerandhidPlot {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int m=sc.nextInt();
                int c=0;
                if(n>m){
                    c=n-m;
                }
                else{
                    c=m-n;
                }
                int e=n*m;
                int d=c*c;
                System.out.println(e/d);
            }
            // your code goes here

        }
    }


