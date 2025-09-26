/*
        1 
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
*/
import java.util.*;
public class Pattern34{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print((j-(n-num))+" ");
                }
            }
            System.out.println();
        }
    }
}