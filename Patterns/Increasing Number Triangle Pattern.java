/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
Example :
Input : 5
Output :
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(++num+" ");
            }
            System.out.println();
        }

    }
}
