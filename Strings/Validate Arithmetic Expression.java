/*You are given a string s representing an arithmetic expression.
The expression is considered valid if all the following conditions are satisfied:
Parentheses must be balanced.
Every opening ( must have a matching closing )
Operators allowed: +, -, *, /
Expression cannot:
Start with an operator
End with an operator
Have two consecutive operators
Parentheses must be properly matched and ordered.
Return "Valid" if the expression is valid, otherwise return "Invalid".
Example :
Input : "(a+b)*c"
Output : Valid
Input : "+a*b"
Output : Invalid */

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(valid(s)){
            System.out.print("Valid");
        }
        else{
            System.out.print("Invalid");
        }
    }

    public static boolean valid(String s){
        int n = s.length();
        if(n == 0) return false;
        Stack<Character> stk = new Stack<>();
        char prevChar = ' ';
        for(int i=0;i<n;i++){
            char curChar = s.charAt(i);
            if(curChar == '('){
                if(prevChar!=' ' && prevChar!='+' && prevChar!='-' && prevChar!='*' && prevChar!='/'){
                    return false;
                }
                stk.push('(');
            }
            else if(curChar==')'){
                if(stk.isEmpty()){
                    return false;
                }
                else if(prevChar==' ' || prevChar=='+' || prevChar=='-' || prevChar=='*' || prevChar=='/'){
                    return false;
                }
                else{
                    stk.pop();
                }
            }
            if(curChar=='+' || curChar=='-' || curChar=='*' || curChar=='/'){
                if(prevChar==' ' || prevChar=='+' || prevChar=='-' || prevChar=='*' || prevChar=='/' || prevChar=='('){
                    return false;
                }
            }
            prevChar = curChar;
        }
        if(!stk.isEmpty() || (prevChar=='+' || prevChar=='-' || prevChar=='*' || prevChar=='/')){
            return false;
        }

        return true;
    }
}
