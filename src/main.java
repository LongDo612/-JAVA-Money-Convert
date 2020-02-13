import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount in USD: ");
        double USD = scanner.nextDouble();
        double rate = 23000;
        double VND = USD * rate;
        System.out.println(VND);
    }
}
