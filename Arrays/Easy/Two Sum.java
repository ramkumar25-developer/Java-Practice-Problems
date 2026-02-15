/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example :
Input :
5
1 2 3 4 5
7
Output :
2,3
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
        int target = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(arr[0],0);
        for(int i=1;i<n;i++){
            int temp = target-arr[i];
            if(map.containsKey(temp)){
                System.out.print(map.get(temp)+","+i);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.print("-1");
    }
}
