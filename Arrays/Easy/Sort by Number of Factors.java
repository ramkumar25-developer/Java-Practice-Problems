/*Sort the given elements in ascending order based on the number of factors of each element
Example :
Input : 10 6 8 9 7
Output : 7 9 10 6 8
Explanation :
Number	Factors	       Count
10 ->   1, 2, 5, 10	     4
6	->    1, 2, 3, 6	     4
8	->    1, 2, 4, 8	     4
9	->    1, 3, 9	         3
7	->    1, 7	           2 */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> factors = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!factors.containsKey(arr[i])){
                factors.put(arr[i],fact(arr[i]));
            }
        }
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(factors.get(arr[j])<factors.get(arr[j-1])){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int fact(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i*i != n){
                    count += 2;
                }
                else{
                    count++;
                }
            }
        }
        return count;
    }
}
