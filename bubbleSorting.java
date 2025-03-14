import java.util.*;
public class bubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {7,8,3,1,2};
        // bubble sort
        for(int i = 0; i<(arr.length)-1; i++ ) { // n-1 times
            for(int j = 0; j<arr.length-i-1; j++) { // n-1, n-2, n-3 , n-4, ..........      but in asympyotic notations(big O) we ignore the constant
                if(arr[j] > arr[j+1]) { 
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// so, time complexity = O(n^2)