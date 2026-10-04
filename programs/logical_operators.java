import java.util.Scanner;
public class logical_operators {

    static void logic(int A, int B){
        // there are multiple operators like 
        // 1.OR(||)=if only one condition is correct it will run,
        // 2. NOT(!)= it reverse the result to (yes to no , no to yes).
        if(A>18 && B>75){
            System.out.println("eligable for scholaship");

        }else{
            System.out.println("Not eligable for scholership");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // here A is = age and B is = rank

        System.out.print("Enter Your Age : ");
        int A = sc.nextInt();
        System.out.print("Enter Your rank : ");
        int B = sc.nextInt();

        logic(A, B);

        sc.close();
    }
}
