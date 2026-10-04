public class conditionalstatements {

    static void ifelsefuntion(int A,int B,int marks){

        //if elese coditional oprators for only one condition
        if (A<B) {
            System.out.println("A is greater then b");
        }else{
            System.out.println("A is less then b");
        }
            
        //elseif contional operator is used for multiple conditions

        if (marks>90){
            System.out.println("grade +A");
        }
        else if(marks>80){
            System.out.println("grade A");
        }
        else if(marks>70){
            System.out.println("grade B");
        }
        else if(marks>60){
            System.out.println("grade C");
        }
        else if(marks>50){
            System.out.println("grade D");
        }
        else if(marks>40){
            System.out.println("grade F");
        }

    }
    public static void main(String[] args) {
        
        int A = 10;
        int B = 20;
        int marks = 80;
       
        
        
        ifelsefuntion(A,B,marks);
        
    }
    

}
    

