/*
1 2 3 4 5 
6 7 8 1 2
3 4 5 6 7
8 1 2 3 4
5 6 7 8 1
*/
import java.util.*;
public class Pattern73{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(num+" ");
                num++;
                if(num>8){
                    num=1;
                }
            }
            System.out.println();
        }
    }
}