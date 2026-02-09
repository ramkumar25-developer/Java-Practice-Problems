/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
Example :
Input : 5
Output :
A
BB
CCC
DDDD
EEEEE

*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            char ch = (char) ('A'+i);
            for(char j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
