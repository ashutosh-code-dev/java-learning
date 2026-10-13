class Student{
    String name;
    int age;

    Student(){
        name = "unknown";
        age = 0;
    }
    void display(){
        System.out.println(name+"-"+age);
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 =new Student();

        s1.display();
    }
}
