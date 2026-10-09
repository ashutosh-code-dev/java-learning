import java.util.Scanner;
public class Method_Multiple_Parameters {
    public static void main(String[] argn){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        add(a, b);
        int result = Addition(10, 30);
        System.out.println(result);
        sc.close();
        System.out.println(isEven(10));

        
    }
    static void add(int a , int b){
        System.out.println("Addition of A and B :" + (a+b) );
        
    }
    // method that return a value

    static int Addition(int a , int b){
        return a +b ;
    }
    //defining the number is even or odd

    static boolean isEven(int number){
        return number %2 == 0;
    }

    
    }

