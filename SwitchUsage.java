import java.util.Scanner;
public class SwitchUsage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        switch(marks){
         case 10: System.out.println("Fail");
                       break;
         case 50: System.out.println("D");
                       break;
         case 80: System.out.println("B");
                       break;
         case 90: System.out.println("A");
                       break;
         default: System.out.println("Invalid marks");

        sc.close();
    }
                     
    }
}
