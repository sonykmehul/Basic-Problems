import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void selSort(int[] arr, int num){
        int temp;
        for(int i = 0; i < num; i++){
            for(int j = i+1 ; j<num ; j++){
                if(arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
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
            selSort(arr, num);
        }
    }
}
