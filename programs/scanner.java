/**
 * scanner
 */

import java.util.Scanner; 
public class scanner {

    
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Value Of A : ");
        int A = sc.nextInt();
        System.out.print("Enter Value Of B : ");
        int B = sc.nextInt();
        

        System.out.println("sum : "+(A+B));
        System.out.println("sub : "+(A-B));
        System.out.println("multi : "+(A*B));
        System.out.println("div : "+(A/B));
        System.out.println("mod : "+(A%B));
        
        sc.close();
    }



}

