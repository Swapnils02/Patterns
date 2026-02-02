/*
        1
      2   2
    3       3
  4           4
5               5
  4           4
    3       3
      2   2
        1
*/
import java.util.*;
public class Pattern77{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i<=n){
                    if(j==n-i+1 || j==n+i-1){
                       System.out.print(i+" ");
                    }
                    else{
                       System.out.print("  ");
                    }
                }
                else if(i>n){
                    if(j==i-n+1 || j==2*n-(i-n+1)){
                        System.out.print((2*n-i)+" ");
                    }
                    else{
                       System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}