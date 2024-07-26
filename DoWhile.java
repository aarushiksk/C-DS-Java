public class DoWhile {
    public static void main(String[] args) {
        int num=10;
        int sum=0;
        do{
            System.out.print(num+" ");
            num--;
            sum+=num;
        }while(num>=1);
        if(sum%2==0)
         System.out.println("Even");
        else
         System.out.println("Odd");
    
    }
    
}
