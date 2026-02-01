/*
A 
A B A
A B C B A
A B C D C B A
A B C D E D C B A
*/
import java.util.*;
public class Pattern54{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int ch=65;
            for(int j=1;j<=2*n-1;j++){
                if(j>=n-i+1 && j<=n+i-1){
                    System.out.print((char)ch +" ");
                    if(j<n){
                        ch++;
                    }
                    else{
                        ch--;
                    }
                }
            }
            System.out.println();
        }
    }
}