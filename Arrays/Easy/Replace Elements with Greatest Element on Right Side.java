/*Given an array arr, replace every element in that array with the greatest element among the elements to its right,
and replace the last element with -1. After doing so, return the array.
Example 1:
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = -1;
        for(int i=n-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp>max){
                max = temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
