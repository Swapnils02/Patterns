/*
        *
      *   *
    *   *   *
  *   *   *   *
*   *   *   *   *
*/
import java.util.*;
public class Pattern13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=n-i;j>=1;j--){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" *  ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j<=n-i || j>=n+i || (i%2==1 && j%2==0) || (i%2==0 && j%2==1)){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // for(int i=1;i<=n;i++){
        //     boolean flag=true;
        //     for(int j=1;j<=2*n-1;j++){
        //         if(j>=n-i+1 && j<=n+i-1 && flag){
        //             System.out.print("* ");
        //             flag=false;
        //         }
        //         else{
        //             System.out.print("  ");
        //             flag=true;
        //         }
        //     }
        //     System.out.println();
        // }
    }
}