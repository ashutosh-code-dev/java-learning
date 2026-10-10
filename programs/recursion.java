public class recursion {

    static void printnumber(int n){

        if (n==0){
            return ;
        }
        printnumber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printnumber(5);
        System.out.println("sum of numbers "+number(5));

        System.out.println("factorial of number "+fact(5));

        for(int i =0;i<7;i++){
            System.out.println(fib(i)+" ");
        }
        
    }
    //sum of first 5 numbers
    static int number(int n){
        if (n==0){
            return 0;
        }
         return  n + number(n-1);

    }
    //factorial using recursion
    static int fact(int n){
        if (n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    // fibonacci series using recursion
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}