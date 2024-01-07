import java.util.Scanner;

public class Second_02 {
  // java Second_02.java
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*
     * System.out.println("enter a num:");
     * int n=sc.nextInt();
     * String type=(n%2==0)?"even":"odd";
     * System.out.printf(n+" is an "+type+" number");
     */
    /*
     * System.out.println("Enter marks:");
     * float marks = sc.nextFloat();
     * String result = (marks > 33) ? "PASS" : "FAIL";
     * System.out.println(result);
     */

    int number = 2;
    switch (number) {
      case 1:
        System.out.println("Pizza");
        break;
      case 2:
        System.out.println("Burger");
        break;
      case 3:
        System.out.println("Sandwich");
        break;
      default:
        System.out.println("Not a valid order");
        break;
    }
    // System.out.println("Enter number 1");
    // int a = sc.nextInt();
    // System.out.println("Enter number 2");
    // int b = sc.nextInt();
    // System.out.println("Enter the operator");
    // char operator = sc.next().charAt(0);
    int a = 4, b = 3;
    char operator = '+';
    /*
     * In Java, single quotes (') are used to represent characters, while double
     * quotes (") are used to represent strings.
     */
    switch (operator) {
      case '+':
        System.out.println(a + b);
        break;
      case '-':
        System.out.println(a - b);
        break;
      case '*':
        System.out.println(a * b);
        break;
      case '/':
        System.out.println(a / b);
        break;
      default:
        System.out.println("Enter a valid operator");
        break;
    }
    int counter = 1;
    while (counter <= 3) {
      System.out.println("hello world");
      counter++;
    }
    System.out.println("Printing 1 to 10 using while loop");
    counter = 1;
    while (counter <= 10) {
      System.out.println(counter);
      counter++;
    }
    /*
     * System.out.println("\t");
     * System.out.
     * println("Enter the value of number till which you want to print the numbers:"
     * );
     * int n = sc.nextInt();
     * int j = 1;
     * System.out.println("Printing numbers from 1 to " + j);
     * while (j <= n) {
     * System.out.println(j);
     * j++;
     * }
     */
    /*
     * int m = 0;
     * System.out.println("\t");
     * System.out.println("Enter n to calculate sum of n:");
     * int n2 = sc.nextInt();
     * int sum = 0;
     * while (m <= n2) {
     * System.out.println(i + "+");
     * sum += m;
     * m++;
     * }
     * System.out.println("      ");
     * System.out.println("Sum of " + n2 + " numbers is: " + sum);
     */
    int num = 199;
    int rev = 0;
    while (num > 0) {
      int lastDigit = num % 10;
      rev = (rev * 10) + lastDigit;
      num = num / 10;
    }
    System.out.println("reverse of the number is: " + rev);
    /*
     * !SECTIONthe do-while loop is a control flow statement that executes a block
     * of code repeatedly as long as a specified condition evaluates to true. The
     * key difference between a do-while loop and a while loop is that the do-while
     * loop guarantees that the block of code is executed at least once, as the
     * condition is checked after the execution of the loop body.
     */
    int cancer = 1;
    do {
      System.out.println("DO WHILE:" + cancer);
      cancer++;
    } while (cancer <= 10);
    // BREAK STATEMENT IS USED TO EXIT FROM THE LOOP
    // Continues execution from next line of code outside the loop if the break
    System.out.println("\t");
    for (int i = 1; i <= 4; i++) {
      if (i == 3) {
        break;
      }
      System.out.println(i);
    }
    System.out.println("\t");
    // KEEP ENTERING NUMBERS TILL USER ENTERS A MULTIPLE OF 10
    /*
     * int numbers;
     * while (true) {
     * System.out.println("Enter a number:");
     * numbers = sc.nextInt();
     * if (numbers % 10 == 0) {
     * break;
     * }
     * }
     * System.out.println("You entered a multiple of 10.");
     */
    /*
     * 
     * In Java, the continue keyword is used within loops (such as for and while
     * loops) to skip the rest of the code inside the loop for the current iteration
     * and move on to the next iteration. It is often used when you want to skip the
     * remaining code in the loop under certain conditions, without exiting the
     * entire loop.
     */
    for (int i = 1; i <= 5; i++) {
      if (i == 3) {
        continue;// skips i =3 and prints all the rest numbers
      }
      System.out.println(i);
    }
    // DISPLAY ALL NUMBERS ENTERED BY THE USER EXCEPT THE MULTIPLE OF 10
    /*
     * int number3;
     * while (true) {
     * System.out.println("Enter a number:");
     * number3 = sc.nextInt();
     * if (number3 % 10 == 0) {
     * continue;
     * }
     * System.out.println(number3);
     * this code will never end
     * }
     * System.out.println("hey");
     */
    System.out.println("Enter a number to check if it is a prime number or not");
    int number4 = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= number4 - 1; i++) {
      if (number4 % i == 0) {
        isPrime = false;
        // break; // Exit the loop if a divisor is found
      }
    }
    if (isPrime == true) {
      System.out.println(number4 + " is a prime number");
    } else {
      System.out.println(number4 + " is not a prime number");
    }
    // java Second_02.java
  }
}
