import java.util.Scanner;

public class natural_number_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n to find sum using for loop: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;
            int sumFor = 0;
            for (int j = 1; j <= n; j++) {
                sumFor += j;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Both results are " + (sumFormula == sumFor ? "equal." : "not equal."));
        } else {
            System.out.println("Not a natural number.");
    }

}
