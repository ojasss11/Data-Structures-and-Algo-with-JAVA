/* 
POLYMORPHISM::many forms
When we try to do the similar thing in multiple forms
There are two types of POLYMORPHISM::-
⁡⁣⁢⁣1.COMPILE TIME POLYMORPHISM(static)-->METHOD OVERLOADING
2.RUN TIME POLYMORPHISM(dynamic)-->METHOD OVERRIDING⁡
*/
// ⁡⁣⁢⁣𝗠𝗲𝘁𝗵𝗼𝗱 𝗼𝘃𝗲𝗿𝗹𝗼𝗮𝗱𝗶𝗻𝗴⁡:IS multiple functions with same name but different parameters

public class contructor_inheri_polymor{
    public static void main(String[] args) {
        // Student Aniket=new Student();
        // Student Sujal=new Student("SUJAL DESHMUKH");
        // Student Anup=new Student("ANUP", 13);
        // Student Ajay=new Student(10);

       /*  StudentNew s1=new StudentNew();
        s1.name="shraddha";
        s1.rollno=19;
        s1.password="abcd";
        s1.marks[0]=90;
        s1.marks[1]=91;
        s1.marks[2]=92;
        
        StudentNew s2=new StudentNew(s1);
        s2.password="abcdef";
        s2.marks[1]=100;
        
        for (int i=0;i<3;i++) {
            System.out.print(s1.marks[i]+" ");
        }
System.out.println();
        System.out.println("roll no:"+s2.rollno);
        System.out.println("roll no:"+s2.name);
        System.out.println("pasword:"+s2.password);
        */
        // Fish tuna=new Fish();
        // tuna.eat();
        // Fish shark=new Fish();
        Dog dobby=new Dog();
        dobby.eat();
        System.out.println(dobby.legs=4);


    }
}
class StudentNew{
    String name;
    int rollno;
    String password;
    int marks[];
    String address;
    StudentNew(){
        this.marks=new int[3];
        System.out.println("THIS IS A NON PARAMETERIZED CONSTRUCTOR");
    }
    StudentNew(String name){
                this.marks=new int[3];

        this.name=name;
    }
    StudentNew(int rollno){
                this.marks=new int[3];

        this.rollno=rollno;
    }
    StudentNew(String name,int rollno){
                this.marks=new int[3];

        this.rollno=rollno;
        this.name=name;
    }
    //shallow copy constructor
//     StudentNew(StudentNew s1){
//                 marks=new int[3];
// this.marks=s1.marks;
//         this.name=s1.name;
//         this.rollno=s1.rollno;

//     }
StudentNew(StudentNew s1){
    this.marks=new int [3];
    this.name=s1.name;
    // this.password=s1.password;
    this.rollno=s1.rollno;
    for(int i=0;i<3;i++){
        System.out.println(s1.marks[i]);
    }

}
}
//⁡⁣⁣⁢𝗜𝗡𝗛𝗘𝗥𝗜𝗧𝗔𝗡𝗖𝗘 𝗜𝗦 𝗪𝗛𝗘𝗡 𝗽𝗿𝗼𝗽𝗲𝗿𝘁𝗶𝗲𝘀 𝗮𝗻𝗱 𝗺𝗲𝘁𝗵𝗼𝗱𝘀 𝗼𝗳 𝘁𝗵𝗲 𝗯𝗮𝘀𝗲 𝗰𝗹𝗮𝘀𝘀 𝗮𝗿𝗲 𝗽𝗮𝘀𝘀𝗲𝗱 𝗼𝗻 𝘁𝗼 𝘁𝗵𝗲 𝗱𝗲𝗿𝗶𝘃𝗲𝗱 𝗰𝗹𝗮𝘀𝘀.
/* 
There are four types of INHERITANCE IN JAVA
⁡⁢⁣⁢1.SINGLE LEVEL INHERITANCE(BASE CLASS--> DERIVED CLASS)
⁡
⁡⁣⁢⁣2.MULTI LEVEL INHERITANCE(BASE CLASS--> DERIVED CLASS --> DERIVED CLASS)
FOR EG: ANIMALS--> MAMMALS--> DOG,CAT,TIGER,HUMAN

⁡⁢⁣⁣3.HIERARCHIAL INHERITANCE: SINGLE BASE CLASS AND MULTIPLE DERIVED CLASSES
BASE CLASS--> DERIVED CLASS 1;--> DERIVED CLASS 2;-->DERIVED CLASS 3;-->DERIVED CLASS 4.
⁡⁣⁢⁣FOR EG: Animals--> FISH[swim()],-->BIRD[fly()],--->MAMMAL[walk()]⁡
⁡

*/
/* 
⁡⁢⁣⁢𝗣𝗮𝗿𝗲𝗻𝘁 𝗰𝗹𝗮𝘀𝘀--> 𝗖𝗵𝗶𝗹𝗱 𝗰𝗹𝗮𝘀𝘀
𝗕𝗮𝘀𝗲 𝗰𝗹𝗮𝘀𝘀--> 𝗗𝗲𝗿𝗶𝘃𝗲𝗱 𝗰𝗹𝗮𝘀𝘀⁡
*/
/* 
⁡⁣⁢⁢𝗔𝗻𝗶𝗺𝗮𝗹{
    𝗲𝗮𝘁();𝗯𝗿𝗲𝗮𝘁𝗵𝗲(),𝘀𝗸𝗶𝗻𝗰𝗼𝗹𝗼𝗿();
}
𝗙𝗶𝘀𝗵 𝗲𝘅𝘁𝗲𝗻𝗱𝘀 𝗔𝗻𝗶𝗺𝗮𝗹⁡
*/

//⁡⁣⁢⁣𝗯𝗮𝘀𝗲 𝗰𝗹𝗮𝘀𝘀⁡
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

void breathe(){
    System.out.println("breathe");
}
}
//⁡⁣⁢⁣𝗱𝗲𝗿𝗶𝘃𝗲𝗱 𝗰𝗹𝗮𝘀𝘀 ⁡⁣⁢⁣𝘀𝘂𝗯𝗰𝗹𝗮𝘀𝘀⁡⁡
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
class Bird extends Animal{
    void fly(){
System.out.println("Fly");
    }
}
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
}
class Dog extends Mammal{
    String breed;

}