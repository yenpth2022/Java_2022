package lab_06;
//String myPassword = "password123";
//Allow user to input maximum 3 times

import java.util.Scanner;

public class MyPassword {

    public static void main(String[] args) {

        String myPassword = "password123";
        int maxTry = 3;
        boolean correct = false;

        for (int index = 0; index < maxTry; index++) {
            // cho nhap password tu ban phim
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your password:");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(myPassword)) {
                System.out.println("You have entered correctly password");
                correct = true;
                break;
            } else {
                System.out.println("You have entered incorrect password " + (index + 1) + " time(s).Try again.");
            }

        }
        if (correct == true) {
            System.out.println("===============");
        } else {
            System.out.println("You have tried 3 times. Try in the next time");
        }
    }
}
