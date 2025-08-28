import java.util.Scanner;

public class Assi1Ques11 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int limit = sc.nextInt();
        System.out.println("Pythagoras triplets:");
        for(int m =2; m<limit; m++){
            for(int n= 1; n<m; n++){
                int a = m*m - n*n;
                int b = 2*m*n;
                int c = m*m + n*n;
                if(c<limit){
                    System.out.println(a + " , "+b +" , "+ c);
                }
            }
        }

        
    }
    
}
