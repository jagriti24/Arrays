import java.util.ArrayList;

/**
 * Created by jagriti on 1/4/15.
 */
public class MaxIntegerSum {

    public static void maxSum() {
        int arr[] = {1, -9, -5, -6, 5, 9, 3, -4};
        int max = arr[0];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int counter = 0, count = 0;
            while (counter <= i) {
                count = count + arr[i];
                counter++;
            }
            if (max < count) {
                max = count;
            }
        }
	System.out.println("Max integer sum for array is:"); 
        System.out.println(max);
    }
    
    public static void main(String args[]){

      maxSum();
    }
}

