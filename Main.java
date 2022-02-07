import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner weightInput = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = weightInput.nextDouble();

        Scanner heightInput = new Scanner(System.in);
        System.out.print("Enter height in inches: ");
        double height = heightInput.nextDouble();

        BMI myBmi = new BMI(weight, height);
        System.out.println("BMI is " + myBmi.getBMI());
        System.out.println(myBmi.getInterpretation());
    }
}
