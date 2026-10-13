class student{
    String name;
    int age;

    void study(){
        System.out.println(name+" is studying and his age is "+age);
    }
}
public class oop_in_java {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name="Ashutosh";
        s1.age = 20;

        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.study();

        //using multiple objects in same class

        student s2 = new student();
        s2.name ="rahul";
        s2.age =21;

        s2.study();

    }
}

