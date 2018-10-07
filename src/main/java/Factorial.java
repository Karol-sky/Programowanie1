import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe N");
        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt();
        System.out.println(n + "! = " +  calculate(n));


    }


        public static int calculate (int n) {
            if (n <= 1)
                return 1;
            return n * calculate(n - 1);
    }

    }


