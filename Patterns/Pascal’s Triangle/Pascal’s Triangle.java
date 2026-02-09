/*Given an integer n. You need to recreate the pattern given below for any value of N.
Example :
Input : 5
Output :
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1

*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-(i+1);j++){
                System.out.print(" ");
            }
            int val = 1;
            for(int j=0;j<=i;j++){
                System.out.print(val+" ");
                val = val*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
