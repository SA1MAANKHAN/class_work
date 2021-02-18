import javax.swing.plaf.synth.SynthUI;

public class arithmeticOperations {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        float c = 3.3F;
        float d = 2.2F;
//    addition
        int sum    = a + b ;
        float sumf = c + d ;
//    subtraction
        int sub    = a - b ;
        float subf = c - d ;
//    multiplication
        int mul    = a * b ;
        float mulf = c * d ;
//    division
        int div    = a / b ;
        float divf = c / d ;

        System.out.printf("The sum of int is %d and float is %f\n",sum,sumf);
        System.out.printf("The sub of int is %d and float is %f\n",sub,subf);
        System.out.printf("The mul of int is %d and float is %f\n",mul,mulf);
        System.out.printf("The div of int is %d and float is %f\n",div,divf);
    }
}
