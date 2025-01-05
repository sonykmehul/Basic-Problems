import java.util.Arrays;
import java.util.Scanner;

public class insSort {
    public static void bubSort(int[] arr, int num){
        for(int i = 1; i < num; i++){
            int temp = arr[i];
            int j = i - 1;
            for(; j >= 0 ; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                } 
            }
            arr[j+1] = temp;
            System.out.printf("Round %d: ", i);
            System.out.println(Arrays.toString(arr));
            System.out.println();

        }

        System.out.print("Sorted array (Insertion Sort): ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int num = reader.nextInt();
            int arr[];
            arr = new int[num];
            System.out.print("Enter the array: ");
            for (int i = 0; i < num ; i++){
                arr[i] = reader.nextInt();
            }
            bubSort(arr, num);
        }
    }
}
