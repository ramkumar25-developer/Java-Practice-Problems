/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
Example :
Input : 5
Output :
ABCDE
ABCD
ABC
AB
A

*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        for(int i=n-1;i>=0;i--){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
