import java.util.Scanner;

public class program1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length:");
        int length=input.nextInt();
        System.out.println("Enter the breath:");
        int breath= input.nextInt();
        int area=length*breath;
        System.out.println("The area of Rectangle is:"+area);
    }
}
