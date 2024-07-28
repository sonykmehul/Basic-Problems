import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Print Fibonacci Series");
            System.out.print("Enter a number: ");
            int num = reader.nextInt();
            int a = 0, b = 1, c = 1;
            System.out.println(a);
            for (int i = 1; i < num; i++){
                System.out.println(c);
                c = b + a;
                a = b;
                b = c;                
            }
        }
    }
}