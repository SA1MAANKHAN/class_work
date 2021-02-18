import java.util.Scanner;

public class elseIf {
    public static void main(String args[])
    {
        int a = 4, b = 8, c = 7;
        if (a > b)
        {
            if (a > c)
            {
                System.out.println("Largest value is : "+a);
            }
            else
            {
                System.out.println("Largest value is : "+c);
            }
        }
        else
        {
            if (c > b)
            {
                System.out.println("Largest value is : "+c);
            }
            else
            {
                System.out.println("Largest value is : "+b);
            }
        }
    }
}
