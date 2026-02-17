/*Given an n × m matrix, return all elements of the matrix in diagonal zigzag order.
The traversal starts from the top-left corner and moves along diagonals. The direction alternates between:
Up-right direction ↗
Down-left direction ↙
Alternate the direction after each diagonal.
Example :
Intput : 3x3
1 2 3
4 5 6
7 8 9
Output : 1 2 4 7 5 3 6 8 9 */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int d=0;d<n+m-1;d++){
            int i = d<m?0:d-m+1;
            int j = d<m?d:n-1;

            if(d%2==1){
                while(i<n && j>=0){
                    System.out.print(arr[i++][j--]+" ");
                }
            }
            else{
                int ri=i;
                int rj=j;
                while(ri<n-1 && rj>0){
                    ri++;
                    rj--;
                }
                while(ri>=0 && rj<m){
                    System.out.print(arr[ri--][rj++]+" ");
                }
            }
        }
    }
}
