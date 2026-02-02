/*
1
3 3 3
5 5 5 5 5
3 3 3
1
*/
import java.util.*;
public class Pattern72{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int k=(i<=n/2+1)?i:n-i+1;
                if(j<=2*k-1){
                    System.out.print((2*k-1)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}