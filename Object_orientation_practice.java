class Pen1{
String color;
int tip;
//this keyword is used to refer the current object
public void SetColor(String newcolor){
    this.color=newcolor;
}
public void SetTip(int newtip){
    this.tip=newtip;
}
 public String GetColor(){
        return this.color;
    }
public int GetTip(){
        return this.tip;
    }
}
class StudentNew1{
String name;
int rollno;
String address;
int marks[]=new int[3];
// int percentage=(marks[0]+marks[1]+marks[2])/3;
StudentNew1(){
    System.out.println("CONSTRUCTOR IS CALLED......");

}

StudentNew1(String newname){
    this.name=newname;
}
StudentNew1(int newrollno){
    this.rollno=newrollno;
}
StudentNew1(String newname,int rollno){
    this.name=newname;
    this.rollno=rollno;
}
StudentNew1(StudentNew1 s1){
    this.marks=s1.marks;
  this.name=s1.name;
  this.rollno=s1.rollno;

}
}

class Animal2{
    public void eat(){
        System.out.println("EATING");
    }
    public void breathe(){
        System.out.println("BREATHING");
    }
}
class Fish2 extends Animal2{
    int fins;
    public void swim(){
        System.out.println("SWIMS IN WATER");
    }
}
class Mammals2 extends Animal2{
     int legs;
     void walk(){
        System.out.println("WALKS");
    }
}
class Bird2 extends Animal2{
     int legs;
     void fly(){
        System.out.println("FLYING IN AIR");
    }
}
class Dog2 extends Animal2{
    int legs;
public void bark(){
    System.out.println("BARKING");
}
}
//CONSTRUCTOR IS A SPECIAL METHOD WHICH IS INVOKED AUTOMATICALLY AT THE TIME OF OBJECT CREATION
public class Object_orientation_practice {
    // class n objects 
     public static void main(String[] args) {
        /* 
        Pen1 p=new Pen1();
        p.SetColor("BLUE");
        p.SetColor("YELLOW");
        p.SetTip(10);
        System.out.println("COLOR OF PEN IS:"+p.color);
        System.out.println("TIP OF PEN IS:"+p.tip);
        System.out.println(p.GetColor());
        */

//       StudentNew1 ojas=new StudentNew1("ojas");
//     System.out.println(ojas.name);
// StudentNew1 ob=new StudentNew1();
StudentNew1 s1=new StudentNew1(10);
// System.out.println(s1.rollno);
// StudentNew1 s2=new StudentNew1("RITIK");
// System.out.println(s2.name);
// StudentNew1 s3=new StudentNew1();
// StudentNew1 s4=new StudentNew1("RAHUL", 20);
// System.out.println(s4.name);
// System.out.println(s4.rollno);
// s1.name="KSHITIJ";
// s1.marks=new int[3];
// s1.marks[0]=90;
// s1.marks[1]=89;
// s1.marks[2]=88;
// StudentNew1 s5=new StudentNew1(s1);
// System.out.println(s5.rollno);
// System.out.println(s5.name);
// s5.marks[2]=35;//here reference of the array is copied hence it can be changed later
// for (int elem : s5.marks) {
//     System.out.println(elem);
// }
Fish2 tuna=new Fish2();
tuna.swim();
Fish2 shark=new Fish2();
shark.eat();
Dog2 tommy=new Dog2();
tommy.bark();
tommy.legs=4;
System.out.println(tommy.legs);
Mammals2 human=new Mammals2();
Bird2 parrot=new Bird2();
parrot.fly();
human.walk();
// System.out.println(tuna.swim());


        
     }
}

















































































































































































































































//CODE ENDS HERE//