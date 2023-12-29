import java.util.Scanner;

public class practice1Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter any 2 numbers for sum:");
int a=sc.nextInt();
int b=sc.nextInt();
int sum=a+b;
System.out.println("Sum of 2 numbers is:"+sum);
System.out.println("TO CALCULATE SIMPLE INTERSEST:");
System.out.println("Enter the principle amount:");
float principle=sc.nextFloat();
System.out.println("Enter the rate:");
float rate=sc.nextFloat();
System.out.println("Enter the duration(time):");
float time=sc.nextFloat();
float si=(principle*rate*time)/100;
System.out.println("The simple interst is: "+si);
System.out.println("\t");
System.out.println("Enter 3 number's to check who is greater::");
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
if(num1>num3 &&num1>num2){
    System.out.println(num1+" is greatest among the three");
}
else if(num2>num3&& num2>num1){
    System.out.println(num2+" is greatest among the three");
}
else{
    System.out.println(num3+" s greatest among the three");
}
System.out.println("Enter the number to fill it's sum till N:");
int n=sc.nextInt();
int sum2=0;
for(int i=0;i<=n;i++){
    sum2+=i;
}
System.out.println("The sum of first "+n+" numbers is:"+sum2);
        // Call the isPrime function to check if a number is prime
        System.out.println("Enter any number");
        int num = sc.nextInt();
        boolean isPrimeResult = isPrime(num);

        if (isPrimeResult) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

      System.out.println(Math.sqrt(4));
    }

    public static boolean isPrime(int num) {
        // Handle the case where num is less than or equal to 1
        if (num <= 1) {
            return false;
        }

        // Iterate from 2 to the square root of num to check for divisibility
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // If num is divisible by i, it's not a prime number
                return false;
            }
        }

        // If no divisor is found, num is a prime number
        return true;
    }
}
