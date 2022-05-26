package lab_02;

import java.util.Scanner;

public class BMICalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height(cm):");
        float height = scanner.nextFloat();

        System.out.println("Enter your weight(kg):");
        float weight = scanner.nextFloat();

        // unit: height = m; weight = kg
        float BMI = weight/((height/100)*2);
        if (BMI <= 18.5){
            System.out.println("Underweight");
        } else if (BMI <= 24.9){
            System.out.println("Normal weight");
        } else if (BMI <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

    }
}
