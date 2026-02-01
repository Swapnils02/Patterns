/*
1 2 3 4 5 
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
*/
import java.util.*;
public class Pattern57{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=n;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}