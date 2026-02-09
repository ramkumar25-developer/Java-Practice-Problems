/*The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, one 1" or 1211.
1211 is read off as "one 1, one 2, two 1s" or 111221.
111221 is read off as "three 1s, two 2s, one 1" or 312211.
Example :
Input : 5
Output :
1
11
21
1211
111221

*/import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "1";
        System.out.println(s);
        for(int i=1;i<n;i++){
            String next = "";
            int count = 1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j) == s.charAt(j-1)){
                    count++;
                }
                else{
                    next = next + count + s.charAt(j-1);
                    count = 1;
                }
            }
            next = next + count + s.charAt(s.length()-1);
            System.out.println(next);
            s = next;
            next = "";
        }
    }
}
