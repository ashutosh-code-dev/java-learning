public class string_buildin_functions {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";

        if (a.equals(b)) {
            System.out.println("same");
        } else {
            System.out.println("diffrent");
        }
        password();
        substring();
        counting_characters();
    }

    static void password() {
        // there is also one build in function , equalIgnorecase it Ignores the whether
        // the
        // word is in upper case or in lower case.
        String password = "ashu@123";
        if (password.equals("ashu@123")) {
            System.out.println("correct password");

            // there are some build in functions like contains(), startswith(), endswith()
            // ,.trim()
            // .tolowercase(),.touppercase().

        }

    }
    static void substring(){
        String name = "Ashutosh";
        System.out.println(name.substring(0,4));

        //converting string into integer

        String num = "100";
        int number = Integer.parseInt(num);
        System.out.println(number+20);

        //there is oppsite function of this which is "String.valueof(Integer name)"
        }

        static void counting_characters(){
            String str = "hello";
            int count = 0;

            for (int i =0 ;i< str.length();i++){
                if (str.charAt(i)=='l'){
                    count++;
                }
            }
            System.out.println("count = "+count);
        }
}
