/*
            *  
         #  #
      *  *  *
   #  #  #  #
*  *  *  *  *
*/
import java.util.*;
public class Pattern65{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<n-i+1){
                    System.out.print("   ");
                }
                else{
                    if(i%2==1){
                        System.out.print("*  ");
                    }
                    else{
                        System.out.print("#  ");
                    }
                }
            }
            System.out.println();
        }
    }
}