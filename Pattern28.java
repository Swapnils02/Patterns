/*
5 4 3 2 1 
5 4 3 2
5 4 3
5 4
5
*/
import java.util.*;
public class Pattern28{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=n;j>=i;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){
            int num=n;
            for(int j=1;j<=n;j++){
                if(j<=n-i+1){
                    System.out.print(num+" ");
                    num--;
                }
            }
            System.out.println();
        }
    }
}