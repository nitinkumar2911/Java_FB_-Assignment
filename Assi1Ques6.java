import java.util.Scanner;

public class Assi1Ques6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int res = 0;
        while( n>0){
            int rem = n%10;
            res = res*10 + rem;
            n/=10;
        }
        if(res == num){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }
    
}
