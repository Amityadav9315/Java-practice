import java.util.*;
public class Notimetowait {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int h=sc.nextInt();
                int x=sc.nextInt();
                int [] arr=new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();

                }
                for(int i=0; i<arr.length; i++){
                    if(arr[i]+x==h){
                        System.out.println("Yes");
                    }
                }
                //if {
                    System.out.println("No");

                }
            }
            // your code goes here

        }



