package exception3;
import java.util.Scanner;

public class Exception3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer :");
        int num1=input.nextInt();
        int num2=input.nextInt();
//        System.out.println("Result :"+num1+"/"+num2+"="+(num1/num2));
        try{
            System.out.println("Result :"+num1+"/"+num2+"="+(num1/num2));
        }
        catch(ArithmeticException e){
            System.out.println("Exeption: Divisor can not be zero");
        }
        
        
                
    }
}


