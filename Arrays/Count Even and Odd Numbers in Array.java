/*Given an array of integers, count and print the number of even elements and odd elements in the array.
Example :
Input :
5
1 2 3 4 5
Output :
Even: 2, Odd: 3

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
        int even  = 0;
        int odd = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print("Even: "+even+", Odd: "+odd);
    }
}
