/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
Example :
Input : 5
Output :
E 
DE
CDE
BCDE
ABCDE

*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<=n-1;j++){
                System.out.print((char) ('A'+j));
            }
            System.out.println();
        }

    }
}
