/*
1 * 3 * 5 
1 * 3 *
1 * 3
1 *
1
*/
import java.util.*;
public class Pattern63{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                if(j<=n){
                    if(j%2==1){
                        System.out.print(j+" ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}