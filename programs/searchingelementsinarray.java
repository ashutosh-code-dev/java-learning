public class searchingelementsinarray {
    
    public static void main(String[] args) {
        
    

    int[] number = {10, 20, 30, 40, 50};

    int search = 30;
    boolean found = false;

    for(int i = 0 ; i <number.length;i++){

        if (number[i]==search){
            System.out.println("number found at index : "+i);
            
            break;
        }
    
    }

    if(found){
        System.out.println("number found");

    }
    else{
        System.out.println("number not found");
    }
    }
}

