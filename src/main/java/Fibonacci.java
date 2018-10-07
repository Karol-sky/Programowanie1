import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        System.out.println("Podaj liczbe N");
        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt();
        System.out.println(n + "Liczba = " +  numbersFibonacci(n));


    }

    public static int numbersFibonacci(int n) {

        if ((n==1)||(n==2))
                return 1;
            else
                return numbersFibonacci(n-1)+numbersFibonacci(n-2);
    }

}
