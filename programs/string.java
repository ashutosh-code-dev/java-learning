import java.util.Scanner;
public class string {
    public static void main(String[] args){
        String name = "ashutosh";
        System.out.println(name);

        stringinput();
        characters();
    }
    //using string input function we took input of string.
    static void stringinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        
        //there is some diffrence between .next() and .nextline() in .next() string only 
        // reads one word and in .nextline() string reads the whole line .
        String name = sc.next();


        System.out.println("Hello "+name);
        sc.close();
    }
    //for accessing the length of the string we use .length() function but there is a sligth
    // diffrence in array we use it like arr.length but in string we use it like name.length()
    // in sting we have to use () to get the length .

    // Accessing characters in string
    static void characters(){
        String name = "ashutosh";

        System.out.println(name.charAt(1));

        // it has a built in function charAt(index no.)
    }



}
