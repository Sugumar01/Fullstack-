import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        //array
        //array lenth 6(0-5)
//        int[] numbers=new int[6];
        // System.out.println(numbers[5]);
        // for loop
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        System.out.println("hello");
//        for(int i=1;i=<5;i++){
//            System.out.println();
//
//        System.out.println(5==5);
//igf,ifelse,elseif,nested if else
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are major");
        }
        else{
            System.out.println("you are minor");
        }
    }
}