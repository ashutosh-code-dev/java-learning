import java.util.Scanner;

public class arrayelementaddition {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your array size: ");
        int n = sc.nextInt();

        int[] number = new int[n];
        System.out.println("Enter Your Array value : ");

        for(int i=0; i<n ;i++){
            number[i] = sc.nextInt();
        }

        int sum=0;

        for(int i = 0; i < n; i++){
            sum = sum + number[i];
        }
        System.out.println("the sum of your array is : "+sum);

        //finding avarage of array values

        double Avarage = sum/n;

        System.out.println("the avarage of array is : "+Avarage);


        sc.close();
}
}
