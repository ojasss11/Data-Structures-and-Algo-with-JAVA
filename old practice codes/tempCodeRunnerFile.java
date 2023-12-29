System.out.println("ENTER YOUR AGE:");
int age=sc.nextInt();
if(age<=12){
  System.out.println("CHILD");
}
else if(age>12 && age<18){
  System.out.println("TEENAGER");
}
else{
  System.out.println("ADULT");
}