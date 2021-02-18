import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num between 1 and 6");
        int num = sc.nextInt();
            switch (num){

                case 1:
                    System.out.println("This is case num 1");
                    break;
                case 2:
                    System.out.println("This is case num 2");
                    break;
                case 3:
                    System.out.println("This is case num 3");
                    break;
                case 4:
                    System.out.println("This is case num 4");
                    break;
                case 5:
                    System.out.println("This is case num 5");
                    break;
                case 6:
                    System.out.println("This is case num 6");
                    break;
                default:
                    System.out.println("Enter a valid input");
            }

    }
}
