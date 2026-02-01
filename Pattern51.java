/*
# 
# *
# * #
# * # *
# * # * #
# * # *
# * #
# *
#
*/
import java.util.*;
public class Pattern51{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}