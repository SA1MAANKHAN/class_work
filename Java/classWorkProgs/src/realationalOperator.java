public class realationalOperator {
    public static void main(String args[]) {
        boolean a, b, c, d, e, f;
        int x = 3;
        int y = 4;
        a = x == y;
        b = x < y;
        c = x > y;
        d = x <= y ;
        e = x >= y;
        f = x != y;
        System.out.printf("x = %d and y = %d\n",x,y);
        System.out.printf(" x == y %b\n",a);
        System.out.printf(" x < y %b\n",b);
        System.out.printf(" x > y %b\n",c);
        System.out.printf(" x <= y %b\n",d);
        System.out.printf(" x >= y; %b\n",e);
        System.out.printf(" x != y %b\n",f);
    }
}
