/*
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5 
*/
import java.util.*;
public class Pattern71{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int count=i;
            for(int j=1;j<=2*n-1;j++){
                if(j<n-i+1 || j>n+i-1){
                    System.out.print("  ");
                }
                else{
                    System.out.print(count+" ");
                    if(j<n){
                        count++;
                    }
                    else{
                        count--;
                    }
                }
            }
            System.out.println();
        }
    }
}