import java.util.Scanner;

import javax.management.StringValueExp;

public class problems_on_loops{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int i=0;
//         while (true) {
//             System.out.println("ENTER NUMBER:");
//             int num=sc.nextInt();
//             if(num==-1){
//     break;
// }
//             sum=sum+num;

//         }
        // System.out.println("SUM OF ALL THE NUMBERS IS: "+sum);
        // while (true) {
        //     int num=sc.nextInt();
        //     if((num%5==0) && (num%7==0)){
        //         System.out.println("NUMBER IS FOUND: "+ num);
        //         break;
        //     }
        //     // num++;
        // }
        int n=sc.nextInt();
        int numberofdigits=0;
        int sumofdigits=0;
        int original_n=n;
        while(n>0){
            n=n/10;
            numberofdigits++;
        }
        System.out.println("THE NUMBER OF DIGITS IN: "+ original_n +" = "+numberofdigits);
        while(n>0){
            sumofdigits+=n;
            n=n/10;
        }
        System.out.println("THE NUMBER OF DIGITS IN: "+ original_n +" = "+numberofdigits);











    }
    
}



// import java.util.Scanner;

// public class Coding_wallah {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Example of taking input from the user and printing it
//         System.out.println("ENTER THE NUMBER:");
//         int lucky_number = sc.nextInt();
//         System.out.println("LUCKY NUMBER IS: " + lucky_number);
        
//         System.out.println("ENTER YOUR NAME:");
//         String your_name = sc.next();
//         System.out.println("YOUR NAME IS: " + your_name);
        
//         System.out.println("ENTER TWO NUMBERS:");
//         int num_1 = sc.nextInt();
//         int num_2 = sc.nextInt();
//         int sum = num_1 + num_2;
//         System.out.println("SUM IS: " + sum);
        
//         System.out.println("ENTER PRINCIPAL, RATE OF INTEREST, TIME:");
//         float principal = sc.nextFloat();
//         float rate = sc.nextFloat();
//         float time = sc.nextFloat();
//         float si = (principal * rate * time) / 100;
//         System.out.println("SIMPLE INTEREST IS: " + si);
        
//         System.out.println("ENTER A CHARACTER:");
//         char ch = sc.next().charAt(0);
//         System.out.println("FIRST LETTER IS: " + ch);
        
//         // Example of using bitwise operators
//         System.out.println("ENTER A NUMBER:");
//         int num = sc.nextInt();
//         if (num % 2 == 0) {
//             System.out.println("EVEN");
//         } else {
//             System.out.println("ODD");
//         }
        
//         // Example of using if-else-if ladder
//         System.out.println("ENTER YOUR AGE:");
//         int age = sc.nextInt();
//         if (age <= 12) {
//             System.out.println("CHILD");
//         } else if (age > 12 && age < 18) {
//             System.out.println("TEENAGER");
//         } else {
//             System.out.println("ADULT");
//         }
        
//         // Example of using a switch statement
//         System.out.println("ENTER ANY DAY BETWEEN (1 TO 7):");
//         int day = 2; // Assuming day 2 is Tuesday for demonstration purposes
//         switch (day) {
//             case 1:
//                 System.out.println("MONDAY");
//                 break;
//             case 2:
//                 System.out.println("TUESDAY");
//                 break;
//             case 3:
//                 System.out.println("WEDNESDAY");
//                 break;
//             case 4:
//                 System.out.println("THURSDAY");
//                 break;
//             case 5:
//                 System.out.println("FRIDAY");
//                 break;
//             case 6:
//                 System.out.println("SATURDAY");
//                 break;
//             case 7:
//                 System.out.println("SUNDAY");
//                 break;
//             default:
//                 System.out.println("NOT A VALID DAY");
//                 break;
//         }
        
//         // Example of using logical operators in an if statement
//         int x = 90, y = 60;
//         if (y * x == 5400 && x + y == 150) {
//             System.out.println("GOOD");
//         } else {
//             System.out.println("BAD");
//         }
        
//         // Example of using a for loop to find the sum of numbers
//         int n = 10;
//         int sum = 0;
//         for (int i = 0; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println("SUM OF " + n + " NUMBERS IS: " + sum);
        
//         // Example of taking multiple inputs until a specific condition is met
//         int inputnum;
//         int sum1 = 0;
//         while (true) {
//             System.out.println("ENTER THE NUMBER:");
//             inputnum = sc.nextInt();
//             if (inputnum == -1) {
//                 break;
//             }
//             sum1 = sum1 + inputnum;
//         }
//         System.out.println("SUM OF ALL THE NUMBERS TILL NOW IS: " + sum1);
        
//         // Example of finding the first number divisible by 5 and 7
//         while (true) {
//             int numip = sc.nextInt();
//             if ((numip % 5 == 0) && (numip % 7 == 0)) {
//                 System.out.println("NUMBER THAT IS DIVISIBLE BY 5 AND 7 IS: " + numip);
//                 break;
//             }
//         }
        
//         sc.close();
//     }
// }

