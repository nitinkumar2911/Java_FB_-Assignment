import java.util.Scanner;

public class Assign1Ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int s =0;
        while(n>0){
            int digit = n%10;
            s +=digit;
            n/=10;

        }
        System.out.println("The sum of digits of a  number "+num+ " is "+s);


    }
    
}
