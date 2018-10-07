import java.util.Scanner;

public class NnumberOfSequence {


    public static void main(String[] args) {
        System.out.println("Podaj liczbe N");
        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt();
        System.out.println(n + "Liczba = " + numOfSeq(n));


    }

    public static double numOfSeq(int n) {

        if (n == 1)
            return 1;
        if (n == 2)
            return 0.5;

        return -numOfSeq(n - 1) * numOfSeq(n - 2);
    }
}