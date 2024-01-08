import java.util.*;

public class Fourth_04 {
  // java Fourth_04.java
  public static void main(String[] args) {// main method starts here
    // FUNCION OVERLOADING::multiple function with same name but differentparameters
    // Function overloading has difference in parameters not return type
    /*
     * In Java, an array is a data structure that allows you to store multiple
     * values of the same type under a single variable name. Arrays are fixed in
     * size, and each element in the array can be accessed using an index.
     */
    Scanner sc = new Scanner(System.in);
    System.out.println(sum(3, 5));
    System.out.println(sum(3, 3, 3));
    System.out.println("Is 5 a prime no? " + isPrime(5));
    System.out.println("Is 12 a prime no? " + isPrime(12));
    primesInRange(100);
    printHollowRectange(6, 20);
    System.out.println("\t");
    invertedHalfPyramid(10);
    System.out.println("\t");
    invertNumPyramid(5);
    System.out.println("\t");
    floydsTraingle(5);
    System.out.println("\t");
    int phy = 30, chem = 29, math = 33;
    int[] marks = { phy, chem, math };
    String[] fruits = { "apple", "mango", "orange" };
    for (int i = 0; i < fruits.length; i++) {
      System.out.println(fruits[i] + " ");
    }
    for (int i = 0; i < marks.length; i++) {
      System.out.println("Subject " + (i + 1) + ":" + marks[i]);
    }
    int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };
    int moreNumbers[] = { 10, 11, 12, 13, 14, 15 };
    int mark[] = new int[50];
    int marks1[] = new int[3];
    /*
     * System.out.println("Enter the marks of physics chemistry and maths:");
     * marks1[0] = sc.nextInt();
     * marks1[1] = sc.nextInt();
     * marks1[2] = sc.nextInt();
     */
    int physics = marks[0] = 98;
    int chemistry = marks[1] = 98;
    int mathematics = marks[2] = 98;
    System.out.println("Physics marks: " + physics);
    System.out.println("Chemistry marks: " + chemistry);
    marks1[2] = marks1[2] + 1;
    System.out.println("Maths marks: " + mathematics);
    System.out.println("length of array is: " + marks1.length);
    int arr[] = { 10, 20, 30, 40, 50 };
    // printing our array
    update(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    // linear search:finds the index of the element at a given array
    int searcher[] = { 10, 20, 30, 40, 50, 60, 90, 70, 80 };
    int keyChecker = linearSearch(searcher, 30);
    if (keyChecker == -1) {
      System.out.println("Key not found");
    } else {
      System.out.println("Key is found at index " + keyChecker);
    }
    String menu1[] = { "samosa", "dosa", "idli", "vada", "vadapav" };
    int menuCheck = linearSearchStrings(menu1, "vadapav");
    if (menuCheck == -1) {
      System.out.println("USING STRING SEARCH Key not found");
    } else {
      System.out.println("USING STRING SEARCH Key is found at index " + menuCheck);
    }
    System.out.println("\t");
    // searcher[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
    System.out.println("Largest of the array searcher is :" + largestNumber(searcher));
    int arrSearch[] = { 10, 20, 30, 40, 50 };
    int keyBinary = binarySearch(arrSearch, 50);
    if (keyBinary == -1) {
      System.out.println("USING BINARY SEARCH key not found");
    } else {
      System.out.println("USING BINARY SEARCH Key is found at index " + keyBinary);
    }
  } // main method ENDS here
  // java Fourth_04.java

  public static int binarySearch(int arr[], int key) {
    int start = 0, end = arr.length - 1;
    int mid = (start + end) / 2;
    while (start <= end) {
      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static int largestNumber(int arr[]) {
    int large = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > large) {
        large = arr[i];
      }
    }
    return large;
  }

  public static int linearSearchStrings(String menu[], String key) {
    for (int i = 0; i < menu.length; i++) {
      if (menu[i].equals(key)) {
        return i;
      }
    }
    return -1;
  }

  public static int linearSearch(int numbers[], int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }
    return -1;// return -1 if not found in array
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  // function to calculate integer sum
  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  // function to calculate float sum
  public static float sum(float a, float b, float c) {
    return a + b + c;
  }

  public static void update(int arr[]) {
    // adding 1 in the array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
    }
  }

  public static void invertNumPyramid(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i + 1); j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void floydsTraingle(int line) {
    int counter = 1;
    for (int i = 1; i <= line; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }

  public static void invertedHalfPyramid(int line) {
    // INVERTED AND ROTATED HALF PYRAMID
    for (int i = 1; i <= line; i++) {
      for (int j = 1; j <= (line - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void primesInRange(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void printHollowRectange(int totalRow, int totalCol) {
    for (int i = 1; i <= totalRow; i++) {
      for (int j = 1; j <= totalCol; j++) {
        if (i == 1 || i == totalRow || j == 1 || j == totalCol) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static boolean isPrime(int n) {
    boolean isPrimeNumber = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {// completely dividing
        // isPrimeNumber = false;
        // break;
        return false;
      }
    }
    return true;
  }
}
