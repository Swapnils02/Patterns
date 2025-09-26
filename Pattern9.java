/*
* # * # * 
* # * # *
* # * # *
* # * # *
* # * # *
*/
import java.util.*;
public class Pattern9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}