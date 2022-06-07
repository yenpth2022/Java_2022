package lab_06;
//String url = "https://google.com";
//Check http OR https; domain name, .com OR .net

import java.util.Scanner;

public class URLCheck {

    public static void main(String[] args) {

        String myString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String:");
        String inputURL = scanner.nextLine();

        System.out.println("The URL check = " +
                (((inputURL.startsWith("http")) || inputURL.startsWith("https"))
                        && ((inputURL.endsWith(".com")) || inputURL.endsWith(".net"))));

    }


}
