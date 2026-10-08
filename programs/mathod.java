public class mathod {
    static void greet(){
        System.out.println("Hello Ashutosh");
    }
    public static void main(String[] args) {
        greet();
        

        String name = "ashutosh";
        name(name);
        int a = 10;
        integer(a);
    }

    //method with parameter

    static void name(String name){
        System.out.println("Your Name Is "+name);
    }

    //method with an integer parameter

    static void integer(int a){
        System.out.println("square of integer "+a+" is : "+a*a);
    }
}
