import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //Declare a variable
//        String name;
    //Initialize the variable
//    name="Sk";
    //Update the variable
//        name="sugu";
//        System.out.println("Name:"+name);
//    System.out.println("Hi " +name+", Welcome to my website");
//        System.out.println("Hi " +"name"+", Welcome to my website");
//        System.out.println("Hi " +name+", Welcome to my website");
//Scanner class
        String name;
Scanner scan=new Scanner(System.in);
System.out.println("Enter your name: ");
name=scan.next();
System.out.println("Enter your age: ");
int age=scan.nextInt();
System.out.println("Enter your CGPA: ");
double cgpa=scan.nextDouble();
System.out.println("Are you working somewhere, Answer 'Y' or 'N' ");
char workingSomewhere=scan.next().charAt(0);
System.out.println("Describe your goal  in a line");
String description=scan.nextLine();
System.out.println("confirm your details ");
System.out.println("Name :"+name);
System.out.println("Age :"+age);
System.out.println("CGPA :"+cgpa);
System.out.println("Are you working :"+workingSomewhere);
System.out.println("your goal :"+description);
System.out.println("Please confirm your details !! Enter correct or Wrong ");
String confirmation=scan.next();
if(confirmation.equalsIgnoreCase("CORRECT")){
    System.out.println("Hi "+name+",Welcome to my website!");
}else{
    System.out.println("Please apply later !1");
}

}
}