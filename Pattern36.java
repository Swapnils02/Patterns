/*
        1 
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
*/
import java.util.*;
public class Pattern36{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
            
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print((n-j+1)+" ");
                }
            }
            System.out.println();
        }
    }
}