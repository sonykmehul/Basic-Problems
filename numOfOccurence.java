import java.util.Arrays;
import java.util.Scanner;

public class numOfOccurence {
    public static int firstOcc(int[] arr, int n, int k) {
        int s = 0, e = n-1;
        int mid = s + (e-s)/2;
        int ind = -1;
        while(s<=e){
            if(arr[mid]==k){
                ind = mid;
                e = mid - 1;
            }
            else if(arr[mid] > k){
                e = mid - 1;
            }
            else if(arr[mid] < k){
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ind;
    }

    public static int lastOcc(int[] arr, int n, int k) {
        int s = 0, e = n-1;
        int mid = s + (e-s)/2;
        int ind = -1;
        while(s<=e){
            if(arr[mid]==k){
                ind = mid;
                s = mid + 1;
            }
            else if(arr[mid] > k){
                e = mid - 1;
            }
            else if(arr[mid] < k){
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ind;
    }

    public static void main(String[] args) {
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
            int firstInd = firstOcc(arr, num, find);
            int lastInd = lastOcc(arr, num, find);
            if (firstInd == -1){
                System.out.println("Not found");
            }else{
                System.out.printf("%d occured %d times", find, lastInd-firstInd+1);
            }
            
        }
    }
}
