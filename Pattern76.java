/*
1  
2  3
4      5
6          7
8  9  10  11  12
*/
import java.util.*;
public class Pattern76{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==n){
                    System.out.print(num+"  ");
                    num++;
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}