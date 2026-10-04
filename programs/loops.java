import java.util.Scanner;
public class loops {

    //this function is for break and continue function demo
    static void breakcontinue(int A){
        for(int i = 1; i<=10 ; i++){
           if (i == 5){
            continue ; 
           }
            System.out.println(i);
        }
    }

    //this function is for do-while loop demonstation
    static void dowhileloop(int A){
        int i = 1;
        do{
            System.out.println(A+" x "+i+" = "+(A*i));
            i++;
        }while(i<=10);
        
    }



    //this function is for while loop demonstration
    static void whileloop(int A){
        int i = 1;
        while(i<=10){
            System.out.println(A+" x "+i+" = "+(A*i));
            i++;
        }
    }


    //this function is for for loop demonstration 
    static void forloop(int A){
        for(int i = 0 ; i<=10 ; i++){
        System.out.println(A+" X "+i+" = "+(A*i));
    }
    
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    int A = sc.nextInt();
    
    // forloop(A);
    // whileloop(A);
    // dowhileloop(A);
    breakcontinue(A);
    sc.close();
}
}


