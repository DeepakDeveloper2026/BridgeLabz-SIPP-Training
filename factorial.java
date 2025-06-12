import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to find factorial using while loop: ");
        int factNum = sc.nextInt();
        if (factNum >= 0) {
            int factorial = 1, k = 1;
            while (k <= factNum) {
                factorial *= k;
                k++;
            }
            System.out.println("Factorial is: " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
    }

}
