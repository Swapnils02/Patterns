/*
*
* *
* * *
* * * *
* * * * *
*
* *
* * *
* * * *
* * * * *
*/
import java.util.*;
public class Pattern70{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=n;j++){
                if((i<=n && j<=i) || (i>n && j<=i-n)){
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