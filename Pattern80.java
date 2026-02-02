/*
1 1 1 1 1 
  2 2 2
    3
  4 4 4
5 5 5 5 5
*/
import java.util.*;
public class Pattern80{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=n/2+1){
                    if(j<=i-1 || j>n-i+1){
                       System.out.print("  ");
                    }
                    else{
                       System.out.print(i+" ");
                    }
                }
                else if(i>n/2+1){
                    if(j<=n-i || j>=2*i-i+1){
                       System.out.print("  ");
                    }
                    else{
                       System.out.print(i+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}