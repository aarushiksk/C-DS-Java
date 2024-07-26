import java.util.Scanner;
public class CalculateError {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Area is:"+PrintArea(a,b));
        sc.close();
    }
    public static int PrintArea(int a,int b){
        return a*b;
    }
}
