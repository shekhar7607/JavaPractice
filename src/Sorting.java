import java.util.Arrays;
import java.util.Scanner;

public class Sorting {


    public static int factorial(int n){

        if (n!=0)
        {
            return n * factorial(n-1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {


        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number for which factorial has to be printed");
        int num = sc.nextInt();

        System.out.println("The factorial of number " + num +" is: "+  factorial(num));


    }
}
