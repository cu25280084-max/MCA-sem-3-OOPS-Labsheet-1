import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int n = num;

        int a = n % 10;
        n = n / 10;

        int b = n % 10;
        n = n / 10;

        int c = n % 10;

        int sum = (a * a * a) + (b * b * b) + (c * c * c);

        if (sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
