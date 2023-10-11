//  In this example, I'll create a simple "Shape" hierarchy with different types of shapes, each demonstrating these OOP concepts.

package Exercise_10;

public class Practice{

    public static void main(String[] args){
     
        Person student1 = new Student("Bishal", 23, 290);
        Person teacher1 = new Teacher("Mohammad", 24, 123);

        // Polymorpism example to introduce the two objects student and teacher
        student1.introduce();
        teacher1.introduce();

        // Encapsulation using getter and setter methods.
        student1.setName("Bishal1");
        student1.setAge(25);

        teacher1.setName("Mohammad1");
        teacher1.setAge(25);

        System.out.println("Student's modified data: Name: "+ student1.getName()+" Age: "+student1.getAge());
        System.out.println("Teacher's Modified data: Name: "+teacher1.getName() + " Age: "+teacher1.getAge());
    }
}

// Inheritance example, Student class inherited from person.
class Student extends Person{
    // Student class constructor or property.
    private int studentId;

    public Student(String name, int age, int studentId){
        super(name, age);
        this.studentId = studentId;
    }

    // Polymorphism example , overriding the introduce method for student.
    @Override
    public void introduce(){
        System.out.println("I am Student with name: "+getName()+" and my age is: "+getAge()+" My Student id is: "+studentId);
    };
} 

class Teacher extends Person{
    private int teacherId;

    public Teacher(String name, int age, int teacherId){
        super(name, age);
        this.teacherId = teacherId;
    };

    // Polymorphism example to override the call the introduce method for teacher
    @Override
    public void introduce(){
        System.out.println("I am teacher with name: "+getName()+" My teaching id is: "+teacherId);
    }
}

// Abstract class Person with common properties and common abstract method .
abstract class Person{
    // Common constructors || common properties
    private String name; 
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Encapsulation: getter and setter methods which can be common to both teacher as well as student.
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;  
    }

    public abstract void introduce();
}
