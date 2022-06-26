package lab_02;

import java.util.Scanner;

public class DefineNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int inputNumber = scanner.nextInt();

        if(inputNumber % 2 == 0){
            System.out.println("Your number is even number");
        } else {
            System.out.println("Your number is odd number");
        }
    }
}
