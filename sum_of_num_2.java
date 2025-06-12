import java.util.Scanner;

public class sum_of_num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double total = 0;
        double input;
        do {
            System.out.print("Enter a number (0 to stop): ");
            input = sc.nextDouble();
            total += input;
        } while (input != 0);
        System.out.println("Total sum is " + total);
    }

}
