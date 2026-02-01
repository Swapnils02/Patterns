/*
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7
    1 2 3 4 5
      1 2 3
        1         
*/
import java.util.*;
public class Pattern60{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=2*n-1;j++){
                if(j<i || j>=2*n-i+1){
                   System.out.print("  ");
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