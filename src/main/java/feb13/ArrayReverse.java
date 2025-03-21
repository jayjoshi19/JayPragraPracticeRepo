package feb13;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        //System.out.println("Original array:\n"+ Arrays.toString(arr));
        int n = arr.length;
        System.out.println(n);
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("Reversed array:\n"+ Arrays.toString(arr));
    }
}
