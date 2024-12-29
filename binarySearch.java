import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static int bserach(int arr[], int num, int find){
        int start = 0, mid;
            int end = num - 1, flag = -1;
            mid = start + (end - start)/2;
            while(start <= end){
                if (find == arr[mid]){
                    flag = mid;
                    return flag;
                }else{
                    if (find < arr[mid]){
                        end = mid - 1;
                    }
                    else if (find > arr[mid]){
                        start = mid + 1;
                    }
                    mid = start + (end - start)/2;
                } 
            }
            return flag;        
    }
    public static void main(String[] args){
       try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter the size of array: ");
            int num = reader.nextInt();
            int arr[];
            arr = new int[num];
            for (int i =0; i<num; i++){
                arr[i] = reader.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("Enter number to be searched: ");
            int find = reader.nextInt();
            int index = bserach(arr, num, find);
            System.out.printf("%d found at %d", find, index);
        }          
    }
}
