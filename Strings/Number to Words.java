/*Given a non-negative integer n, convert the number into its English words representation.
Input : 215
Output : Two hundred and Fifteen */
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.print("zero");
            return;
        }
        String ones[] = {
                ""," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten",
                " Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"};
        String tens[] = {"",""," Twenty"," Thirty"," Forty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
        StringBuilder result = new StringBuilder();
        if(n >= 1000){
            result.append(ones[n/1000]);
            result.append(" thousand");
            n %= 1000;
        }
        if(n >= 100){
            result.append(ones[n/100]);
            result.append(" hundred");
            n %= 100;
            if(n > 0){
                result.append(" and");
            }
        }
        if(n >= 20){
            result.append(tens[n/10]);
            n %= 10;
        }
        if(n > 0){
            result.append(ones[n]);
        }
        System.out.print(result.toString().trim());
    }
}
