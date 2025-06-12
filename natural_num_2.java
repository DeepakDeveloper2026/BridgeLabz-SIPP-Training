import java.util.Scanner;

public class natural_num_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n to find sum using while loop: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sumFormula = n*(n + 1) / 2;
            int sumWhile = 0, i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Both results are " + (sumFormula == sumWhile ? "equal." : "not equal."));
        } else {
            System.out.println("Not a natural number.");
        }
    }
}
