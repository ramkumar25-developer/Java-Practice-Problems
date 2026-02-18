/*Find All Anagrams in Array of Words
Given:
An array of strings arr[]
A target string s
Print all words in arr that are anagrams of s.
An anagram means both strings contain the same characters with same frequency, but order can be different.
Input : n = 5
arr = [act, tac, cat, dog, hello]
s = cat
Output : act tac cat */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        String s = sc.next();
        int m = s.length();
        for(String a : arr){
            int len = a.length();
            if(len != m){
                continue;
            }
            int anagram[] = new int[26];
            for(int i=0;i<m;i++){
                anagram[s.charAt(i)-'a']++;
            }
            for(int i=0;i<len;i++){
                anagram[a.charAt(i)-'a']--;
            }
            boolean check = false;
            for(int i=0;i<26;i++){
                if(anagram[i] != 0){
                    check= true;
                    break;
                }
            }
            if(check){
                continue;
            }
            System.out.print(a+" ");
        }
    }
}
