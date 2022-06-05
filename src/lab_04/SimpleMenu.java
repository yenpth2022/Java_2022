package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMenu {

//        Generate an ArrayList with random numbers(not fixed numbers) those are less than 1000
//        After that, have a menu (You can use while loop) to have below options
//=====MENU======
//        1. Print all numbers
//        2. Print maximum value
//        3. Print minimum value
//        4. Search number
//        Option 01: We print all the numbers that we have in the array list
//        Option 02: We need to find out the maximum number from array list and print out that value
//        Option 03: We need to find out the minimum number from array list and print out that value
//        Option 04: We allow user to input a number to search, if that number is existing in arraylist, we print the number and its index. Otherwise, print that number is not in the list

    public static void main(String[] args) {

        boolean isContinuing = true;
        ArrayList myArray = createArrayList();
        printMenu();

        while (isContinuing) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your option:");
            int inputNumber = scanner.nextInt();
            printMenu();
            if (inputNumber == 1) {
                printArrayList(myArray);
            } else if (inputNumber == 2) {
                printMaxValue(myArray);
            } else if (inputNumber == 3) {
                printMinValue(myArray);
            } else if (inputNumber == 4) {
                searchNumberInArray(myArray);
            } else {
                isContinuing = false;
                System.out.println("==========The end=========");
            }
        }
    }


    public static ArrayList<Integer> createArrayList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the arraySize:");
        int inputArraySize = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < inputArraySize; index++) {
            arrayList.add(new SecureRandom().nextInt(1000));
        }
        System.out.println("The Random Array List = " + arrayList);
        return arrayList;
    }

    private static void printMenu() {
        System.out.println("=====MENU=====\n"
                + "1. Print all numbers\n"
                + "2. Print maximum value\n"
                + "3. Print minimum value\n"
                + "4. Search number\n"
                + "=======================");
    }

    private static void printArrayList(ArrayList myArrayList) {
        System.out.println("All number in array list = " + myArrayList);
    }

    public static void printMaxValue(ArrayList<Integer> myArrayList) {
        int maxValue = myArrayList.get(0);
        for (int index = 0; index < myArrayList.size(); index++) {
            if (myArrayList.get(index) > maxValue) {
                maxValue = myArrayList.get(index);
            }
        }
        System.out.println("The max value in array list = " + maxValue);
    }

    public static void printMinValue(ArrayList<Integer> myArrayList) {
        int minValue = myArrayList.get(0);
        for (int index = 0; index < myArrayList.size(); index++) {
            if (myArrayList.get(index) < minValue) {
                minValue = myArrayList.get(index);
            }
        }
        System.out.println("The min value in array list = " + minValue);
    }

    public static void searchNumberInArray(ArrayList<Integer> myArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to search in ArrayList:");
        int inputNumberSearch = scanner.nextInt();
        boolean isSearch = false;

        for (int index = 0; index < myArrayList.size(); index++) {
            if (inputNumberSearch == myArrayList.get(index)) {
                isSearch = true;
                System.out.println("The number you input = " + inputNumberSearch +
                        ", and the index of this number = " + index);
            }
        }
        if (isSearch == false) {
            System.out.println("The number you search don't appear in the Random Array List");
        }
    }


}
