import java.util.Scanner;

public class Assi1Ques7 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;

    while(n>0){
        System.out.print(a  + "  ");
        int temp = a+b;
        a = b;
        b = temp;
        n--;


    }


}

    
}
