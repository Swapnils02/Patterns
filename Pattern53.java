/*
1 
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
import java.util.*;
public class Pattern53{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=2*n-1;j++){
                if(j>=n-i+1 && j<=n+i-1){
                    System.out.print(num +" ");
                    if(j<n){
                        num++;
                    }
                    else{
                        num--;
                    }
                }
            }
            System.out.println();
        }
    }
}