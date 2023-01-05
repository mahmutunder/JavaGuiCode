package week;

public class SwapNumber {
    public static void main(String[] args) {
        //TODO: Swap 2 variable values without using third variable
        //:TODO Method one
        int x=20;
        int y=10;

         y=x+y;
         x=y-x;
         y=y-x;

        System.out.println("x : " +x);
        System.out.println("y : " +y);

        /******************* method 2 *****************************/
        System.out.println("---------------------");
        int a=20;
        int b=10;

        b= b+a-( a = b );
        System.out.println("a : " + a);
        System.out.println("b : " +b);





    }
}
