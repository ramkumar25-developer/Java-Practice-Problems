/*You are given a string s consisting of uppercase letters (A–Z), lowercase letters (a–z), and digits (0–9).
Your task is to construct a new string such that:
Each letter (case-sensitive) and digit appears at most once in the result.
If a character appears more than once, replace it with the next available unused character of the same type:
For lowercase letters: 'a' → 'b' → ... → 'z' → 'a' (circular)
For uppercase letters: 'A' → 'B' → ... → 'Z' → 'A' (circular)
For digits: '0' → '1' → ... → '9' → '0' (circular)
If all characters of that type are already used, print "Invalid input".
Return the final modified string
Example :
Input : aaabBBB1111
Output : abcdEFG1234 */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean used[] = new boolean[36];
        StringBuilder sb = new StringBuilder();
        int letterCount = 0;
        int digitCount = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                letterCount++;
                if(letterCount>26){
                    System.out.print("Invalid input");
                    return;
                }
                if(ch>='a' && ch<='z'){
                    if(!used[ch-'a']){
                        used[ch-'a'] = true;
                        sb.append(ch);
                    }
                    else{
                        while(true){
                            ch++;
                            if(ch>'z'){
                                ch='a';
                            }
                            if(!used[ch-'a']){
                                used[ch-'a'] = true;
                                sb.append(ch);
                                break;
                            }
                        }
                    }
                }
                else{
                    ch = Character.toLowerCase(ch);
                    if(!used[ch-'a']){
                        used[ch-'a'] = true;
                        ch = Character.toUpperCase(ch);
                        sb.append(ch);
                    }
                    else{
                        while(true){
                            ch++;
                            if(ch>'z'){
                                ch='a';
                            }
                            if(!used[ch-'a']){
                                used[ch-'a'] = true;
                                ch = Character.toUpperCase(ch);
                                sb.append(ch);
                                break;
                            }
                        }
                    }
                }
            }
            else if(Character.isDigit(ch)){
                digitCount++;
                if(digitCount>10){
                    System.out.print("Invalid input");
                    return;
                }
                int num = ch-'0';
                if(!used[26+num]){
                    used[26+num] = true;
                    sb.append(ch);
                }
                else{
                    while(true){
                        num++;
                        if(num>9){
                            num = 0;
                        }
                        if(!used[26+num]){
                            used[26+num] = true;
                            ch = (char) (num+'0');
                            sb.append(ch);
                            break;
                        }
                    }
                }
            }
        }
        System.out.print(sb.toString());
    }
}
