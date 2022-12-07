import java.util.Scanner;

public class ex_3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out.printf("Enter sign: ");
        String sign = scan.nextLine();
        System.out.printf("Enter first number: ");
        double first = scan.nextDouble();
        System.out.printf("Enter second number: ");
        double second = scan.nextDouble();

        switch (sign){
            case "+":
                System.out.printf("%,.2f + %,.2f = %,.2f\n",
                        first, second, first + second);
                break;
            case "-":
                System.out.printf("%,.2f - %,.2f = %,.2f\n",
                        first, second, first - second);
                break;
            case "*":
                System.out.printf("%,.2f * %,.2f = %,.2f\n",
                        first, second, first * second);
                break;
            case "/":
                System.out.printf("%,.2f / %,.2f = %,.2f\n",
                        first, second, first / second);
                break;
            default:
                System.out.println("Try harder!");
        } 
    }
}
