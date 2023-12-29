//Encapsulation is defined as the wraping up of data and methods under a single unit.It also implements data hiding.
//ENCAPSULATION--> CAPSULE
//Constructor is a special type of function which is envoked automatically at the time of object creation
//Constructor have the same name as class or a structure
//Constructor dont have a return type
//Memory allocation happens when a constructor is called
/*
⁡⁣⁢⁣Constructors are of three types:
Non parameterized constructor
Parameterized constructor
Copy constructor⁡
 */
class UniversityStudent{
    int rollno;
    String Student_name;
    UniversityStudent(){
                System.out.println("constructor is called: ");

    }
    UniversityStudent(String studentname){
 this.Student_name=studentname;
        //⁡⁣⁣⁢THIS IS A CONSTRUCTOR
        // System.out.println();⁡
    }
    UniversityStudent(int rollno){
        this.rollno=rollno;
    }
}
public class encapsulation_in_java {
    public static void main(String[] args) {
        // UniversityStudent s1=new UniversityStudent("ANIKET");
        // s1.rollno=10;
        UniversityStudent s2=new UniversityStudent();
        s2.rollno=90;
        UniversityStudent s3=new UniversityStudent(10);
    }
}
