/*
    1 
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/
import java.util.*;
public class Pattern59{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                   System.out.print(" ");
                }
                else{
                   System.out.print(num+" ");
                   num++;
                }
            }
            System.out.println();
        }
    }
}