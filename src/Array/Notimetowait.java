import java.util.*;
public class Notimetowait {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int count=0;
                int n=sc.nextInt();
                int h=sc.nextInt();
                int x=sc.nextInt();
                int [] arr=new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();

                }
                for(int i=0; i<arr.length; i++) {
                    if (arr[i] + x == h) {
                        count++;
                    }
                }
                    if(count>=1){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }

                }

            // your code goes here





