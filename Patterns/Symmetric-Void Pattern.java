/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
Example :
Input : 5
Output :
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(n*2)-(2*i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
