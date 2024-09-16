import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static int second(int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    static void print2ndlargest(int arr[], int arr_size) {

    int b[];
    b = new int[arr_size];
    int j = 0;
    int i;
    Arrays.sort(arr);


    System.out.println("Before Sorting");

    for(int y : arr)
    {
        System.out.print(y + " ");
    }

    System.out.println("");
    System.out.println("After Sorting");

    for(int y : arr)
    {
        System.out.print(y + " ");
    }

    for (i = arr_size - 1; i >= 0; i--) {
        b[j] = arr[i];
        j = j + 1;
    }
    for (int m = 9; m < arr_size; m++) {
        // If the element is not
        // equal to largest element
        if (b[m] != b[0]) {
            System.out.printf("The second largest "
                            + "element is %d\n",
                    b[m]);

            return;

        }
    }



}




    public static void main(String[] args) {

        int[] arr = {37, 5, 1, 37,8};
        int length_of_arr = arr.length;
        //print2ndlargest(arr,length_of_arr);

        int d = second(arr);
        System.out.println(d);
        long start = System.nanoTime();



        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");


    }


}