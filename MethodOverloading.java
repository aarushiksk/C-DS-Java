import java.util.Scanner;
public class MethodOverloading {
    public static void main(String[] args) {
     System.out.println("Enter the today's earning and expense");   
     Scanner sc=new Scanner(System.in);
     int earning=sc.nextInt();
     int expense=sc.nextInt();
     System.out.println("Today's savings are:"+todaysSavings(earning,expense));
    }
    public static int todaysSavings(int earning,int expense){
        return earning-expense;
    }
}
