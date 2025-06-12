import java.util.Scanner;

public class factorial_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial using for loop: ");
        int factNum = sc.nextInt();
        if (factNum >= 0) {
            int factorial = 1;
            for (int l = 1; l <= factNum; l++) {
                factorial *= l;
            }
            System.out.println("Factorial is: " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

        sc.close();
    }
}
