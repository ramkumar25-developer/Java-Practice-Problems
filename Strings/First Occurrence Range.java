/*Find the substring in a that covers the range between the first occurrences of each character in b
Input : 
s1 = "ZOHOCORPORATION"
s2 = "PORT"
Output : "OHOCORPORAT" */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = a.length();
        int m = b.length();
        if(n==0 || m==0){
            System.out.print("Invalid");
            return;
        }
        int st = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            char ch = b.charAt(i);
            boolean found = false;
            for(int j=0;j<n;j++){
                if(ch == a.charAt(j)){
                    st = Math.min(st,j);
                    end = Math.max(end,j);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print("Not found");
                return;
            }
        }
        for(int i=st;i<=end;i++){
            System.out.print(a.charAt(i));
        }
    }
}
