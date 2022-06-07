package lab_06;

//        String myStr="100 minutes";
//        NOT using REGEX,extract digit character from that String
//        Expected output:"100".
//        EX:"12345nabc678"->"12345678"

import java.util.Scanner;

public class DigitCharacterExtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String inputString = scanner.nextLine();

        String newStr = "";
        int lengthString = inputString.length();

        char[] array = inputString.toCharArray();

        for (int index = 0; index < lengthString; index++) {
            if(Character.isDigit(array[index])){
                newStr += array[index];
            } else {

            }
        }

        System.out.println("The expected output without character = " + newStr);
    }
}
