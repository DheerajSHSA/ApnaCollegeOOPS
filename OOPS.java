class Pen {
    String color;
    String type;

    public void write()
    {
        System.out.println("writing something");
    }

    public void printColor()
    {
        System.out.println(this.color);
    }
}
class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println("Student's Name is "+this.name);
        System.out.println("Student's Age is "+this.age);
    }

    Student(Student s2)
    {
        this.name = s2.name;
        this.age = s2.age;

    }

    Student()
    {

    }
}
public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;

        Student s2 = new Student(s1);
        s2.printInfo();



    }
}
