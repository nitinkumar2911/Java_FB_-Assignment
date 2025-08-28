import java.util.Scanner;

public class Assi1Ques9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem, digits);
            n/=10;
        }
        if(sum == original){
            System.out.println(original + " is a Armstrong Number ");
        }else{
            System.out.println(original + " is not a armstrong number");
        }

    }
    
}
