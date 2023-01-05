package week;

public class SwapNumber {
    public static void main(String[] args) {
        //TODO: Swap 2 variable values without using third variable
        //:TODO Method one
        int x=20;
        int y=10;

         y=x+y;// 30 y
         x=y-x; // 20 x
         y=y-x;

        System.out.println("x : " +x);
        System.out.println("y : " +y);


    }
}
