/*Given two matrices A and B, multiply them and print the resulting matrix.
Input :
3 3
1 2 3
4 5 6
7 8 9

3 3
1 2 3
4 5 6
7 8 9

Output :
30 36 42
66 81 96
102 126 150 */
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr1[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int arr2[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int m1 = arr1[0].length;
        int m2 = arr2[0].length;
        if(n2 != m1){
            System.out.print("Multiplication Not Possible");
            return;
        }
        int result[][] = new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                for(int k=0;k<m1;k++){
                    result[i][j] += (arr1[i][k]*arr2[k][j]);
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
