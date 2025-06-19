import java.util.Scanner;

public class Question12_BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Enter a positive height: ");
                height = sc.nextDouble();
            }

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Enter a positive weight: ");
                weight = sc.nextDouble();
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;
            //conditions
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal weight";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("Height	Weight	BMI		Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f	%.2f	%.2f	%s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}