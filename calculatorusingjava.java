import java.util.Scanner;

public class calculatorusingjava {
    public static void main(String[] args) {
        float num1,num2;
        System.out.print("Enter first number: ");
        Scanner scan=new Scanner(System.in);
        num1=scan.nextFloat();
        System.out.print("Enter second number: ");
        Scanner scan2=new Scanner(System.in);
        num2=scan2.nextFloat();
        String prompt="Enter 0 for addition,Enter 1 for multiplication,Enter 2 for subtraction,Enter 3 for division";
        System.out.println(prompt);
        int input=scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Adding two number");
                System.out.print("The result is: ");
                System.out.println(num1+num2);
                    break;
            case 1:
                System.out.println("Multiplying two number");
                System.out.print("The result is: ");
                System.out.println(num1*num2);
                    break;
            case 2:
                System.out.println("Subtracting two number");
                System.out.print("The result is: ");
                System.out.println(num1-num2);
                    break;
                case 3:
                System.out.println("Dividing two number");
                System.out.print("The result is: ");
                System.out.println(num1/num2);
                    break;
        
            default:
                System.out.println("Invalid input");
                    break;
        }
    }
    
}
