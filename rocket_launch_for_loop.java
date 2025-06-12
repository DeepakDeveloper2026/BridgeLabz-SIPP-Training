import java.util.Scanner;

public class rocket_launch_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start number (for loop): ");
        int start = sc.nextInt();
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        
    }

}
