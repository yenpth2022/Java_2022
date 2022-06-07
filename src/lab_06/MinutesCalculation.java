package lab_06;
//Given input string:"2hrs and 5 minutes"
//Please calculate how many minutes in total

import java.util.Arrays;

public class MinutesCalculation {

    public static void main(String[] args) {
        String string = "5 hours and 5 minutes";
        String[] myArray = string.split(" ");
        // System.out.println(Arrays.toString(myArray));

        System.out.println("The total minutes = " + ((Integer.parseInt(myArray[0]) * 60) + Integer.parseInt(myArray[3])));

    }

}
