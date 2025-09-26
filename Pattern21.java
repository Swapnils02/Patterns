/*
    *    
   * *
  *   *
 *     *
* * * * *
*/
import java.util.*;
public class Pattern21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if(j==1 || j==i || i==n){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j==n-i+1 || j==n+i-1 || (i==n && j%2==1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}