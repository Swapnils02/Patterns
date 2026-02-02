/*
5 * 5 * 5 
4 * 4 *
3 * 3
2 *
1
*/
import java.util.*;
public class Pattern64{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i+1){
                    if(j%2==1){
                        System.out.print((n-i+1)+" ");
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