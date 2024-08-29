import java.util.Scanner;

class Algebra{
  Algebra(){
    System.out.println("Constructor of algebra class called......");
  }
  Algebra(int x,int y){
    // System.out.println("Constructor of algebra class called......");
    int sum=x+y;
    System.out.println("Sum is: "+sum);
  }
  public static int sum(int a,int b){
    int sum=a+b;
    return sum;
  
  }
  }
class Person{
  // int age=10;
  int rollno;
  String name;
}
class Student{
  // int age=10;
  int rollno;
  String name;
}

public class Coding_wallah {
  public static void welcome(){
    System.out.println("WELCOME TO THIS CLASS");
  }
    //⁡⁣⁢⁣OBJECTS ARE REAL WORLD ENTITIES
    // CLASSES ARE INSTANCES OF OBJECT
    //java is a class based object oriented programming language
    //Everything in java is written in classes.Class is user defined blueprint consisting of attributes and methods
    // Class car has attributes:Company,Color,Price.CAR class has methods:Openwindow(),openTrunk(),RUN()
    public static void main(String[] args) {
        //main is the entry point of the java program.Public is the acess modifier.Execution of a java program starts with main.
        //JAVA VARIABLES: are the  titles for reserved memory.
        /* 
          JAVA NAMING CONVECTIONS:LOWERCASE(all the letters in lower case).UPPERCASE:(All the letters are in uppercase)
          Camelcase:(codingWallah,ojasBidkar.moneyBorrowed this are example of camel case notation)
          PACKAGES ARE WRITTEN In lowercase⁡
        */
        /* 
        int money=2000;
        money=5000;
        System.out.println(money);
        */
        /*⁡⁣⁢⁣JAVA PROVIDES TWO TYPES OF DATA TYPES:PRIMITIVE AND NON PRIMITIVE
        PRIMITIVE ARE THE INBUILT DATA TYPES IN JAVA.IT HOLDS THE VALUE OF THE VARIBLE
        NON PRIMITIVE DATATYPES ARE THE USER DEFINED DATATYPES IN JAVA.IT IS USED TO HOLD THE MEMORY ADDRESS OF THE VARIABLE.⁡
⁡⁣⁣⁢PRIMITIVE DATA TYPES IN JAVA:boolean,int,double,char,byte,short,long,float
NONPRIMITIVE DATA TYPES IN JAVA:String,Arrays,Classes,Interfaces,ArrayList,HashMap,LinkedList,CustomObject.
⁡⁣⁢⁣JAVA OUTPUT:System.out.println();-->PRINTS THE OUTPUT IN NEW LINE
            System.out.print();-->PRINTS THE OUTPUT IN SAME LINE
            For taking input from the user we use Scanner Class it is imported in the package import java.util.Scanner*;

            ⁡
        */
        Scanner sc=new Scanner(System.in);
        /* 
        System.out.println("ENTER THE NUMBER:");
        int lucky_number=sc.nextInt();
        System.out.println("LUCKY NUMBER IS : "+ lucky_number);
        System.out.println("ENTER YOU NAME:");
        String your_name=sc.next();
        System.out.println("YOUR NAME IS: "+your_name);
        System.out.println("ENTER TWO NUMBERS:");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        int sum=num_1+num_2;
        System.out.println("SUM IS: "+sum);
        */
        /* 
        System.out.println("ENTER PRINCIPAL,RATEOF INTEREST,TIME");
        float principal=sc.nextFloat();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();
        float si=(principal*rate*time)/100;
        System.out.println("SIMPLE INTEREST IS : "+si);
        */
        // System.out.println("ENTER A CHARACTER :");
        // char ch=sc.next().charAt(0);
        // System.out.println("FIRST LETTER IS : "+ ch);
        /*⁡⁣⁣⁢JAVA SCANNER CLASS provides several methods to take input from the users.⁡
         ⁡⁣⁢⁣next(): Reads a single word (a sequence of characters separated by whitespace) as a String.
         nextLine(): Reads a whole line of input (including spaces) as a String.
         nextInt(): Reads the next integer value entered by the user.
         nextDouble(): Reads the next double value entered by the user.
         nextBoolean(): Reads the next boolean value (true or false) entered by the user.⁡
         */
// System.out.println("pqr"+4+2);
/*Here are the bitwise operators available in Java:

Bitwise AND (&&): The bitwise AND operator compares each bit of the first operand with the corresponding bit of the second operand. If both bits are 1, the result is 1; otherwise, it is 0. 
Bitwise OR (||): The bitwise OR operator compares each bit of the first operand with the corresponding bit of the second operand. If either bit is 1, the result is 1; otherwise, it is 0.
Bitwise NOT (~): The bitwise NOT operator inverts each bit of the operand. If a bit is 0, it becomes 1, and if a bit is 1, it becomes 0.

*/
// System.out.println("ENTER A NUMBER:");
// int num=sc.nextInt();
// if(num%2==0){
//   System.out.println("EVEN");
// }
// else{
//   System.out.println("ODD");
// }

// System.out.println("ENTER YOUR AGE:");
// int age=sc.nextInt();
// if(age<=12){
//   System.out.println("CHILD");
// }
// else if(age>12 && age<18){
//   System.out.println("TEENAGER");
// }
// else{
//   System.out.println("ADULT");
// }

/*
 ⁡⁣⁢⁣THIS IS AN EXAMPLE OF NESTED IF ELSE CONDITION
 if (condition1) {
    // Code to be executed if condition1 is true
    if (condition2) {
        Code to be executed if condition2 is true
    } else {
        Code to be executed if condition2 is false
    }
} else {
    Code to be executed if condition1 is false
    if (condition3) {
        Code to be executed if condition3 is true
    } else {
        Code to be executed if condition3 is false
    }
}⁡
 */
// System.out.println("ENTER A NUMBER");
// int num_n=sc.nextInt();
//          String ans;
//          ans=(num_n %2==0)? "IT IS A EVEN NUMBER":"IT IS A ODD NUMBER";
//          System.out.println(ans);
System.out.println("ENTER ANY DAY BETWEEN (1 TO 7) :");
// int day=sc.nextInt();
int day=2;
switch (day) {
  case 1:System.out.println("MONDAY");    
    break;
  case 2:System.out.println("TUESDAY");    
    break; 
  case 3:System.out.println("WEDNESDAY");    
    break;
  case 4:System.out.println("THURSDAY");    
    break;
  case 5:System.out.println("FRIDAY");    
    break;
  case 6:System.out.println("SATURDAY");    
    break;
  case 7:System.out.println("SUNDAY");    
    break;

  default:System.out.println("NOT A VALID DAY");
    break;
}
int x=90,y=60;
if(y*x==5400&& x+y==150){
  System.out.println("GOOD");
}
else{
  System.out.println("BAD");
}
// System.out.println("ENTER THE VALUE OF N:");
// int n=sc.nextInt();
int n=10;
  int sum=0;
for(int i=0;i<=n;i++){
  sum=sum+i;
}
System.out.println("SUM OF "+ n+ " NUMBERS IS :"+ sum);
// int i=1,sum=0;
// while(i<=n){
//   sum=sum+i;
//   i++;
// }
// System.out.println("SUM OF "+ n+ " NUMBERS IS :"+ sum);
/*⁡⁣⁢⁣PROBLEMS ON LOOPS: */
// PRINT SUM OF STREAM OF INTEGERS FROM THE USER
int inputnum;
int i=0;
int sum1=0;
//TO FIND SUM OF ALL THE NUMBERS GIVEN BY THE USER
// while(true){
//     System.out.println("ENTER THE NUMBERS");
//     inputnum=sc.nextInt();
//     if(inputnum==-1){
//       break;
//     }
//   sum1=sum1+inputnum;
// }
// System.out.println("SUM OF ALL THE NUMBERS TILL NOW IS:"+ sum1);

/* 
TO FIND FIRST NUMBER THAT IS DIVISIBLE BY 5 AND 7
while(true){
  int numip=sc.nextInt();
  if((numip%5==0)&& (numip%7==0)){
    System.out.println("NUMBER THAT IS DIVISIBLE BY 5 AND 7 IS :"+ numip);
    break;
  }
}
*/
/* 
System.out.println("Enter the number:");
int num5=sc.nextInt();
int number_of_digits=0;
int originalnum=num5;
while(num5>0){
  num5=num5/10;
  number_of_digits++;
}
System.out.println("The number of digits in number "+originalnum+" are: "+number_of_digits);
System.out.println("Enter the number to find sum of it's digits:");
int num6=sc.nextInt();
int orgnum6=num6;
int sumofdigits=0;
while(num6>0){
  num6=num6/10;
  sumofdigits=sumofdigits+(num6%10);
  sumofdigits++;
}
System.out.println("The sum of digits of "+orgnum6+" is : "+sumofdigits);
*/
/* 
System.out.println("Enter the number to find reverse of it:");
int num7=sc.nextInt();
int reverseddig=0;
while(num7>0){
  reverseddig=reverseddig*10+(num7%10);
  num7=num7/10;
}
System.out.println("The revsered digit of the original number are: "+reverseddig);
*/
/* 
System.out.println("Enter number to find the factorial:");
int number=sc.nextInt();
int fact=1;
for(int j=1;j<=number;j++){
  fact=fact*j;
}
System.out.println("Factorial of a number is: "+fact);
*/
/* 
System.out.println("PRINTING RECTANGULAR PATTERN:");
System.out.println("Enter the number of rows: ");
int rows=sc.nextInt();
System.out.println("Enter the number of columns: ");
int columns=sc.nextInt();
for(int k=1;k<=rows;k++){
  for(int j=1;j<=columns;j++){
    System.out.print(" * ");
  }
  System.out.println();
}
System.out.println("             ");
*/
System.out.println("PRINTING HOLLOW RECTANGLE FACING ERRORS");
// HOLLOW 
// for(int k=1;k<=rows;k++){
//   for(int j=1;j<=columns;j++){
//     if(k==1||k==rows||j==1||j==columns){
//     System.out.print("*");
//   }
//   else{
//     System.out.println();
//   }
// }
// System.out.println();
// }
/* 
System.out.println("PRINTING TRAINGULAR PATTERN:");
for(int line=1;line<=4;line++){
  for(int star=1;star<=line;star++){
    System.out.print("*");
  }
  System.out.println();
}
System.out.println("PRINTING INVERTED TRAINGLE PATTERN:");
int no=sc.nextInt();
for(int k=1;k<=no;k++){
    for(int l=1;l<=(no+1-k);l++){
      System.out.print("*");
    }
    System.out.println();
}
*/
/*
 for(int i=r;i>=1;i--){
  for(int j=1;j<=i;j++){
    sout("*");
  }
  sout();
 }
 */
Person ob=new Person();
ob.rollno=19;
ob.name="OJAS";
System.out.println(ob.rollno);
System.out.println(ob.name);
//⁡⁣⁢⁣new keyword is used to allocate memory to object in java
// Object-oriented programming is a core of Java Programming, which is used for designing a program using classes and objects. OOPs, can also be characterized as data controlling for accessing the code.⁡
Student r=new Student();
r.rollno=90;
r.name="RAM";
System.out.println("The name of r is: "+r.name);
System.out.println("The rollno of r is: "+r.rollno);
welcome();
Algebra a1=new Algebra();
Algebra a2=new Algebra(20, 30);







    }
}
