/*
* * * * * 
 * * * * *
  * * * * *
   * * * * *
    * * * * *
*/
import java.util.*;
public class Pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=1;k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}