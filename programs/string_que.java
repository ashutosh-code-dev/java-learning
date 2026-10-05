public class string_que {
    public static void main(String[] args) {
        counting_characters();
    }
    static void counting_characters(){
        String str = "Java123@Code";

        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int special = 0;
        for (int i = 0 ; i< str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                uppercase++;}
            else if( Character.isLowerCase(ch)){
                lowercase++;
            }
            else if( Character.isDigit(ch)){
                digit++;
            }
            else{
                special++;
            }
        }
        System.out.println("upper case = "+uppercase);
        System.out.println("lower case = "+lowercase);
        System.out.println("digit = "+digit);
        System.out.println("special = "+special);
    }
}
