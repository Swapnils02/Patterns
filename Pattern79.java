/*
1 
2 * 2
3 * 3 * 3
2 * 2 
1
*/
import java.util.*;
public class Pattern79{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=(i<=n/2+1)?i:n-i+1;
            for(int j=1;j<=2*k-1;j++){
                if(j%2==1){
                    System.out.print(k+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}