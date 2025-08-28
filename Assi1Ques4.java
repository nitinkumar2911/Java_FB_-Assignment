import java.util.Scanner;

public class Assi1Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while(n>0){
            n/=10;
            count ++;
        }
        System.out.println("Number of digits in a number  "+ num + " is "+ count );

    }
    
}
