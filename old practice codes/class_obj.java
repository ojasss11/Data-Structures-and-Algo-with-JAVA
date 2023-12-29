class Pen{
    private String color;
    private int tip;
    public String GetColor(){
        return this.color;
    }
    public int GetTip(){
        return this.tip;
    }
    public void SetTip(int newtip){
        this.tip=newtip;
    }
    public void SetColor(String newcolor){
        this.color=newcolor;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    public void calcPercentage(int phy,int chem,int maths){
        percentage=(phy+maths+chem)/3;
    }
}
class BankAccount{
    int acc_number;
   public String username;
   private String password;
public String getPassword() {
    return password;
}
public void setPassword(String newpassword) {
    this.password = newpassword;
}
}

public class class_obj{
    public static void main(String[] args) {
        BankAccount myaccount=new BankAccount();
        myaccount.username="OJAS BIDKAR";
        myaccount.setPassword("OJAS");
        //objects are the entities in the real world
        //classes are group of these entities
        //class consists of attributes and properties
        // Pen p1=new Pen();//created a pen object called p1
        // p1.SetColor("BLUE");
        // System.out.println(p1.color);
        // p1.SetTip(3);
        // System.out.println(p1.tip);
        // p1.SetColor("ORANGE");
        // System.out.println(p1.color);
        // p1.color="YELLOW";
        // System.out.println(p1.color);
        
    }
}