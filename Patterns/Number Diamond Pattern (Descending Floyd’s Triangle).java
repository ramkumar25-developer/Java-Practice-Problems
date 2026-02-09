/*Given an integer n. You need to recreate the pattern given below for any value of N.
Example :
Input : 4
Output :
   1 
  3 2 
 6 5 4 
10 9 8 7 
 6 5 4 
  3 2 
   1 

*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for(int i=1;i<=n;i++){
            num += i;
            int temp = num;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((temp--)+" ");
            }
            System.out.println();
        }
        for(int i=n;i>1;i--){
            num -= i;
            int temp = num;
            for(int j=n;j>i-1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>1;j--){
                System.out.print((temp--)+" ");
            }
            System.out.println();
        }
    }
}
