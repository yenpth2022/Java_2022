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
            System.out.println("You should increase your weight");
        } else if (BMI <= 24.9){
            System.out.println("Normal weight");
            System.out.println("You are beautiful ^^");
        } else if (BMI <= 29.9) {
            System.out.println("Overweight");
            System.out.println("You should decrease your weight");
        } else {
            System.out.println("Obesity");
            System.out.println("Decrease your weight immediately");
        }

    }
}
