import java.util.Scanner;

public class ex_1{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.printf("Enter number: ");
    int num = scan.nextInt();
    int triang_num = 0;
    int factor_num = 1;

    for (int i = 1; i <= num; i++){
     triang_num += i;
     factor_num *= i;
    }

    System.out.printf("Triangular number = %d\nFactorial number = %d\n",
        triang_num, factor_num);
  }
}
