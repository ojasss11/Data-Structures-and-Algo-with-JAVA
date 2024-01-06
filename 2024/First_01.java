import java.util.Scanner;
// java First_01.java
/*
  Type casting in Java involves converting a variable from one data type to another. There are two types of type casting: implicit (automatic) casting and explicit (manual) casting.
  In Java, type promotion, also known as widening or automatic type conversion, refers to the implicit conversion of a value from one data type to a larger or wider data type. This conversion is done by the Java compiler to avoid data loss during certain operations.

Here is the general order of type promotion in Java:

byte -> short -> int -> long -> float -> double:

Smaller data types are automatically promoted to larger data types during certain operations.
char is treated like short in promotions, except when used in arithmetic operations where it is promoted to int.

float -> double:

If an operation involves both float and double, the float is promoted to double.
 */
class First_01{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    /* 
    System.out.println("HELLO");
    char ch='a';
    boolean b=false;
    System.out.println(b);
    byte myByte = 127;
    short myShort = 32767;
    int myInt = 2147483647;
    long myLong = 9223372036854775807L;
    float myFloat = 3.14f;
    double myDouble = 3.14;
    char myChar = 'A';
    boolean myBoolean = true;
    System.out.println(myBoolean);
*/
/* 
//SUM OF 2 NUMBERS
System.out.println("Enter the value of a and b:");
int a=sc.nextInt();
int b=sc.nextInt();
int sum=a+b;
System.out.println(sum);
*/
/* 
System.out.println("Enter the string:");
String str=sc.next();
System.out.println(str);
System.out.println("Enter the value of price:");
float price=sc.nextFloat();
System.out.println(price);
*/
// Area of circle
/* 
System.out.println("Enter the value of radius");
double radius=sc.nextFloat();
double area= Math.PI*radius*radius;
System.out.println(area);
*/
// PRODUCT OF TWO NUMBERS
/* 
System.out.println("Enter any 2 numbers to find it's product");
float a=sc.nextFloat();
float b=sc.nextFloat();
float product=a*b;
System.out.println("product of a and b is:"+product);
*/
float n1=25.4f;
int n2=(int)n1;
System.out.println("value:"+n2);
float marks=99.99f;
int mark=(int)marks;
System.out.println(mark);
int a1=10;
float b1=10f;
long c1=10;
double d1=21;
double ans=a1+b1+c1+d1;
System.out.println(ans);
/* 
JAVA AUTOMATICALLY PROMOTES each byte,short or char to int when evaluating an expression
IF one operand is long,float or double then the whole expression is converted to long,float, or double respectively.
*/
System.out.println("Enter your age:");
// int age=sc.nextInt();
int age=19;
if(age>18){
  System.out.println("You can vote");
}else{
  System.out.println("You cannot vote");
}
// LARGEST OF TWO
/* 
System.out.println("Enter two numbers to check largest:");
float num1=sc.nextFloat();
float num2=sc.nextFloat();
if(num1>num2){
  System.out.println(num1+" is largest of two");
}
else if(num1==num2){
  System.out.println(num1+" = "+num2);
}
else{
  System.out.println(num2+" is largest of two");
}
*/
/* 
System.out.println("Enter a number to check if it's even or odd:");
int number=sc.nextInt();
if(number%2==0){
  System.out.println("Even number");
}
else{
  System.out.println("Odd number");
}
*/
/* 
System.out.println("Enter the income:");
float income=sc.nextFloat();
float tax=0;
if(income<5_00_000){
 tax=0;
}
else if(income>=5_00_000 && income<=10_00_000){
  tax=0.2f*income;
}
else if(income>10_00_000){
  tax=0.3f*income;
}
System.out.println("Tax amount is:"+tax);
System.out.println("Total is:"+tax);
*/
System.out.println("Enter 3 numbers to check the largest of three");
int first=sc.nextInt();
int second=sc.nextInt();
int third=sc.nextInt();
if(first>second && first>third){
  System.out.println(first+" is the largest among the three");
}
else if(second>first && second>third){
  System.out.println(second+" is the largest among the three");
}
else{
  System.out.println(third+" is the largest among the three");
}
int large = (5 > 3) ? 5 : 3;
System.out.println(large);
// java First_01.java
  }
}
