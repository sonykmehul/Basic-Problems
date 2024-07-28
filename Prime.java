import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Check whether a number in prime");
            System.out.print("Enter a number: ");
            int num = reader.nextInt();
            int flag = 0;
            for (int i = 2; i*i < num; i++){
                if(num%i == 0){
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.print("The number is prime.");
            }else{
                System.out.print("The number is not prime.");
            }
        }
    }
}