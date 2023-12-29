public class bin {
    //BINARY TO DECIMAL IN JAVA
    /* decimal to binary  base 10==base 2
     * (1)==(01)
     * (2)==(10)
     * (3)==11
     * 4==100
     * 5=101
     * 6=110
     * 7=111
     * 8=1000
     * 9=1001
     * 10==1010
     * 11==1011
     * 12==1100
     */
//     The program defines a method named BintoDeci that takes an integer binnum as input. This method converts a binary number to its decimal representation.
// Inside the BintoDeci method, a few variables are initialized:
// myNum is assigned the value of the binnum parameter. This is used later for displaying the original binary number.
// pow is set to 0 and will be used as an exponent to calculate the decimal value of each binary digit.
// decimal is set to 0 and will store the calculated decimal value.
// The program enters a while loop that continues as long as binnum is greater than 0.
// Inside the loop, the program calculates the last digit of the binary number by using the modulus operator (%) with a divisor of 10. This gives us the remainder when dividing by 10, which corresponds to the last digit of the binary number.
// The decimal value of the last digit is calculated by multiplying the last digit with 2 raised to the power of pow. This essentially converts the binary digit to its decimal value.
// The decimal value is updated by adding the calculated value from step 5.
// pow is incremented to move to the next binary digit with a higher power of 2.
// binnum is updated by dividing it by 10. This removes the last digit from the binary number since we have already processed it.
// Steps 4 to 8 are repeated until all the binary digits have been processed.
// Finally, the program prints the original binary number (myNum) and its corresponding decimal value (decimal).
// In the main method, the program calls the BintoDeci method with a sample binary number (101) to demonstrate the conversion.
    public static void BintoDeci(int binnum){
        int myNum=binnum;
        int pow=0;
        int decimal=0;
        while (binnum>0) {
            int last_digit=binnum%10;
            decimal=decimal+(int)(last_digit*Math.pow(2, pow));
            pow++;
            binnum=binnum/10;
            
        }
        System.out.println("Decimal of"+myNum +" is: "+decimal);
    }
    public static void main(String[] args) {
        BintoDeci(101);
        
    }
}
