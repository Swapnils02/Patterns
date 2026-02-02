/*
1 2 3 4 5 
2 2 3 4 5
3 3 3 4 5
4 4 4 4 5
5 5 5 5 5
*/
import java.util.*;
public class Pattern74{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}