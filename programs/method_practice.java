

public class method_practice {

    public static void main(String[] argn) {
        age(18);
        table(5);
        factorial(10);
        int[] Array ={10,20,30,40,50};
        array(Array);
    }
    // check person is adult or not

    static void age(int age) {
        if (age >= 18) {
            System.out.println("person is an adult");

        } else {
            System.out.println("person is minor");
        }
    }

    // using loop in method
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + (n * i));
        }
    }

    // factorial of a number using method
    static void factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
    }

    //using array in method
    static void array(int[] Array){
        for (int i =0; i <Array.length;i++){
            System.out.println(Array[i]);
        }
    }
}