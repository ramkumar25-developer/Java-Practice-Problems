/*Exampple :
Input : 1 1 2 2 2 2 3 4 4 4
Ouput : 2 4 1 3 */
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
        int freq[] = new int[n];
        int value[] = new int[n];
        int index = 0;
        int count = 1;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                freq[index] = count;
                value[index] = arr[i-1];
                index++;
                count = 1;
            }
        }
        freq[index] = count;
        value[index] = arr[n-1];

        for(int i=1;i<=index;i++){
            for(int j=i;j>0;j--){
                if(freq[j]>freq[j-1]){
                    int ft = freq[j];
                    freq[j] = freq[j-1];
                    freq[j-1] = ft;
                    int vt = value[j];
                    value[j] = value[j-1];
                    value[j-1] = vt;
                }
            }
        }
        for(int i=0;i<=index;i++){
            System.out.print(value[i]+" ");
        }
    }
}
