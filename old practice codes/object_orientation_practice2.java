class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(double a,double b){
   return a+b;
    }
}

public class object_orientation_practice2 {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.sum(5.5,4.5));
        System.out.println(cal.sum(5,4));
        System.out.println(cal.sum(4,4,4));
    }
}
