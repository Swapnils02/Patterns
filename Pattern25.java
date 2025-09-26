/*
        * 
      * *
    *   *
  *     *
*       *
  *     *
    *   *
      * *
        *
*/
import java.util.*;
public class Pattern25{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if(j==1 || j==i){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1;i>=1;i--){
        //     for(int j=2*n-i;j>i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         if(j==i || j==1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=n;j++){
                if(j==n || (i<=n && j==n-i+1) || (i>n && j==i-n+1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}