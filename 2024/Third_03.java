import java.util.Scanner;

public class Third_03 {
  // java Third_03.java
  public static void printHelloWorld() {
    System.out.println("Hello world");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
    System.out.println("\t");
    for (int i = 1; i <= 4; i++) {
      System.out.println("****");
    }
    // PRINT REVERSE OF A NUMBER
    int num = 29015;
    while (num > 0) {
      int lastDigit = num % 10;
      System.out.print(lastDigit);
      num = num / 10;
    }
    // REVERSE THE GIVEN NUMBER
    System.out.println("\t");
    int reverse = 0;
    int num2 = 987;
    while (num2 > 0) {
      int lastDigit = num2 % 10;
      reverse = (reverse * 10) + lastDigit;
      num2 = num2 / 10;
    }
    System.out.println("Reverse of the number is: " + reverse);
    // java Third_03.java
    System.out.println("Enter a number to check if it is a prime number or not:");
    // int number = sc.nextInt();
    int number = 3;
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime == true) {
      System.out.println(number + " is a prime number");
    } else {
      System.out.println(number + " is not a prime number");
    }
    // PATTERNS IN JAVA
    // STAR PATTERN IN JAVA
    System.out.println("\t");
    for (int line = 1; line <= 3; line++) {
      for (int star = 1; star <= line; star++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    System.out.println("\t");
    // INVERTED STAR PATTERN
    // for inverted the stars second loop should be (n-i+1) n is the number of lines
    int line = 3;
    for (int i = 1; i <= line; i++) {
      for (int star = 1; star <= (line - i + 1); star++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("\t");
    // HALF PYRAMID
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    System.out.println();
    for (int i = 1; i <= 4; i++) {
      for (int numb = 1; numb <= i; numb++) {
        System.out.print(numb);
      }
      System.out.println();
    }
    System.out.println();
    int m = 4;
    for (int lines = 1; lines <= m; lines++) {
      for (int number2 = 1; number2 <= lines; number2++) {
        System.out.print(number2);
      }
      System.out.println();
    }
    /*
     * FUNCTIONS IN JAVA::a function is typically referred to as a method. Methods
     * in Java are blocks of code that perform a specific task and can be invoked
     * (called) when needed.
     * SYNTAX::returnType name(){
     * //body
     * return statement;
     * }
     */
    printHelloWorld();
    printHi();
    System.out.println(sumOfTwo(3, 3));
    /*
     * JAVA FUNTIONS WITH PARAMETERS:
     * returntype name(type param1, type param2){
     * body;
     * return statement
     * }
     */
    // System.out.println("Enter any 2 numbers to calculate sum:");
    // int l = sc.nextInt();
    // int p = sc.nextInt();
    int l = 10;
    int p = l + 1;
    int sum = l + p;
    System.out.println("sum is: " + sumOfTwo(l, p));
    // The parameters inside function definition are known as parameters or formal
    // parameters
    // The parameters during function call are called as formal parameters or actual
    // parameters
    // before swap
    int a1 = 10;
    int b1 = 9;
    System.out.println("The value of a and b before swap is:" + a1 + " , " + b1);
    // after swap
    int temp;
    temp = b1;
    b1 = a1;
    a1 = temp;
    System.out.println("The value of a and b after swap is:" + a1 + " , " + b1);
    int m1 = 10;
    int m2 = 100;
    swap(m1, m2);
    System.out.println("\t");
    int c1 = 10;
    int c2 = 9;
    int mul = productOfTwo(c1, c2);
    System.out.println("multiplication is: " + mul);
    System.out.println("Factorial of 5 is: " + factorial(5));
    System.out.println("Binomial coeff 5C2:" + binomialCoefficient(5, 2));

  }

  // java Third_03.java
  public static int productOfTwo(int a, int b) {
    int product = a * b;
    return product;
  }

  public static int binomialCoefficient(int n, int r) {
    if (r < 0 || r > n) {
      return 0; // Invalid input: k should be between 0 and n (inclusive)
    }
    int nFac = factorial(n);// calculates n factorial
    int rFac = factorial(r);// calculates r factorial
    int nMinusR = factorial((n - r));// calculates (n-r) factorial
    int bino = nFac / (rFac * nMinusR);
    return bino;
  }

  public static int factorial(int n) {
    int f = 1;
    if (n == 0 || n == 1) {
      return 1;
    }
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }
    return f;
  }

  public static void printHi() {
    System.out.println("HI");
  }

  public static int sumOfTwo(int x, int y) {
    int add = x + y;
    return add;
  }

  public static void swap(int a1, int b1) {
    int temp;
    temp = b1;
    b1 = a1;
    a1 = temp;
    System.out.println("The value of a is: " + a1);
    System.out.println("The value of b is: " + b1);
  }

  public static float multiplicationOfTwo(float x, float y) {
    return x * y;
  }
}
