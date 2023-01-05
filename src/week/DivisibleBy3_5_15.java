package week;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        System.out.println(divisibleBy(100));
    }

    public static String divisibleBy(int n) {
        String by3 = "Divisible by 3 ";
        String by5 = "Divisible by 5 ";
        String by15 = "Divisible by 15 ";

        // in case someone enter less  than zero
        if (n<=2){
            System.out.println("It says 1-100, wrong number");
            System.exit(1);
        }

        int i = 1;

        while (i <= n) {

            if (i % 3 == 0 && i % 5 == 0) {
                by15 += i + " ";
            } else if (i % 5 == 0) {
                by5 += i + " ";
            } else if (i % 3 == 0) {
                by3 += i + " ";
            }

            i++;
        }
        return by15 + "\n" + by5 +"\n" + by3 +"\n";
    }
}