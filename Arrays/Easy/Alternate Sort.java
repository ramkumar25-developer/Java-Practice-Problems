/*Given an array of integers, write a program to re-arrange the array in the given form.
1st_largest, 1st_smallest, 2nd_largest, 2nd_smallest, 3rd_largest ……. etc.
Example :
Input : 3 5 6 2 7 4 1
Output : 1 7 2 6 3 5 4  */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        int left = 0;
        int right = n-1;
        int max = arr[n-1]+1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i] = arr[i] + ((arr[left++]%max)*max);
            }
            else{
                arr[i] = arr[i] + ((arr[right--]%max)*max);
            }
        }
        for(int i=0;i<n;i++){
            arr[i] /= max;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
