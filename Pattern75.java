/*
#  1  #  2  #  
3  #  4  #  5
#  6  #  7  #
8  #  9  #  10
#  11  #  12  #
*/
import java.util.*;
public class Pattern75{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0)){
                    System.out.print("#  ");
                }
                else{
                    System.out.print(num+"  ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}