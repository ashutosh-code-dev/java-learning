import java.util.Scanner;

public class ATM {

    static void ATMpin(int pincode,int balance){
        
        Scanner pin = new Scanner(System.in);
        System.out.print("Enter Your Pin : ");
        int A = pin.nextInt();
        

        if (pincode == A) {
            System.out.println("Your balance : "+(balance));
            System.out.print("Enter Your withdrawal Amount : ");
            
            int B = pin.nextInt();
            
            if(B>balance){
                System.out.println("Not Enough Cash Avalable");

            }else if(B<balance){
                System.out.println("Your Money Has Been Withdrawaled");
                
                System.out.println("new balance : "+(balance-B));   
            }
        }else{
            System.out.println("You entered the wrong pin");
        }
        pin.close();
    }
    public static void main(String[] args) {
        
        int balance=50000 ;
        
        int pincode = 12122005;
        
        ATMpin(pincode,balance);

    }
}
