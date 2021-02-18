import java.util.Scanner;

public class conditionalOperator {
    public static void main(String[] args)
    {
        System.out.println("Enter first number");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
//        (num1<num2) ? t(): f();
        if ((num1 < num2)) {
            t();
        } else {
            f();
      }
    }

    private static void t(){
        System.out.println("Second num is Greater");
    }
    private static void f(){
        System.out.println("First num  is Greater");
    }
}
