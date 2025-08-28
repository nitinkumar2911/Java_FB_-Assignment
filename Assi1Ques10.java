import java.util.Scanner;

public class Assi1Ques10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            int fact = 1;
            for(int i = 1; i<=rem;i++){
                fact *=i;
            }
            sum+=fact;
            n/=10;
        }
        if(original == sum){
            System.out.println(original+" is a Strong number");
        }else{
            System.out.println(original + " is not a Strong number");
        }
    }
    
}
