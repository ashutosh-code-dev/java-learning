import java.util.Scanner;
import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Size : ");
        int n = sc.nextInt() ;

        int[] numbers = new int[n];

        for(int i= 0; i<n ;i++){
            System.out.println("Your Array values :");
            numbers[i] =sc.nextInt();
            
        }
        
        for( int number : numbers){
            System.out.println(number);
        }

        // for(int k = 0; k<n;k++){
        //     System.out.println(numbers[k]);
        // }


        // //printing array using for loop
        // System.out.println("Your Array");
        // for( int j= 0 ; j<n;j++){
        //     System.out.println(number[j]);
        // }
            System.out.println(Arrays.toString(numbers));
        
        sc.close();
    }
}