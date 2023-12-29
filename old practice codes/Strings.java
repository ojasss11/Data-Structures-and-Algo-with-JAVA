import java.util.*;
import java.util.Scanner;
public class Strings{
    public static void PrintLetters(String s){
        for(int i=0;i<s.length();i++){
            //first i wrote the for condition as  int i=0;i<=s.lenght{ less than equal will surpass the string limit here}
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
//STRINGS ARE IMMUTABLE IN JAVA
//STRINGS CAN BE USED IN INPUT AS WELL AS OUTPUT

    public static void main(String[] args) {
//         char arr[]={'a','b','c','d','e','f','g'};
//         String str1="abc";
//         String str=new String("ojas");
//         Scanner sc=new Scanner(System.in);
//         String str3=new String("XYZ@123");
//     String name;
//     name=sc.next();
//     System.out.println("enter a string:");
// System.out.println(name);
// String fullname="OJAS BIDKAR";
String firstname="Shraddha";
String lastname="Khapra";
String fullname=firstname+ " "+lastname;//this is known as string concatenation
//to find length of a string we use .length function
// System.out.println(fullname.length());
//charAt--> chracter at index is known as charAt()
// System.out.println(fullname);
// System.out.println(fullname.charAt(0));
String n="ojas";
PrintLetters(n);
    }
}
