// J Frame- It will provide the UI elements for making java application
import java.util.Scanner;

public class ClassObject {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String first=sc.nextLine();
       String last=sc.nextLine();
       System.out.println(concatenate(first,last));
    }
    // public static class Trainer(String firstName, String lastName) {
         
    // }
    public static String concatenate(String firstName, String lastName) {
        return lastName + " " + firstName;
    }

    public static class Student{
        String studentName;
        String enrolledTechnology;
    }
}