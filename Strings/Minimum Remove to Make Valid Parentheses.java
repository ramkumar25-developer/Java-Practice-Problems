/*Given a string s of '(' , ')' and lowercase English characters.
Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
Formally, a parentheses string is valid if and only if:
It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
Example :
Input : "a)b(c)d"
Output : "ab(c)d" */

 import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean invalid[] = new boolean[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stk.push(i);
            }
            else if(ch == ')'){
                if(stk.isEmpty()){
                    invalid[i] = true;
                }
                else{
                    stk.pop();
                }
            }
        }
        while(!stk.isEmpty()){
            invalid[stk.pop()] = true;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<n;i++){
            if(!invalid[i]){
                result.append(s.charAt(i));
            }
        }
        System.out.print(result);
    }
}
