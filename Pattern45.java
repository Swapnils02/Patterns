/*
*   *   *   *   *   
  *   *   *   *
    *   *   *
      *   *
        *
*/
import java.util.*;
public class Pattern45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<=n-i || j>=n+i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }

        // for(int i=n;i>=1;i--){
        //     for(int j=2*n-1;j>=1;j--){
        //         if(j<=n-i || j>=n+i || (i%2==1 && j%2==0) || (i%2==0 && j%2==1)){
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}