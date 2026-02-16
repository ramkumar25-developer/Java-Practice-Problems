/*Given an array of positive numbers. Print the numbers which have longest continuous range.
INPUT  : 1 3 10 7 9 2 4 6
OUTPUT  : 1 2 3 4 */


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
        int max = 1;
        int count = 1;
        int st=0,end=0;
        for(int i=1;i<n;i++){
            if(arr[i-1] == (arr[i]-1)){
                count++;
            }
            else{
                if(count>max){
                    max = count;
                    st = i-count;
                    end = i-1;
                }
                count = 1;
            }
        }
        if(count>max){
            max = count;
            st = n-count;
            end = n-1;
        }
        for(int i=st;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
