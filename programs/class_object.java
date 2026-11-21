class student{
    String name;
    int age;

    void study(){
        System.out.println(name+" is studying and his age is "+age);
    }
}       

public class class_object{
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "rahul";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.study();
    }
}
