package lab_03;

public class CountNumber {

    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5};
        int countEvenNum = 0;
        int countOddNum = 0;

        for (int index = 0; index < myIntArray.length; index++) {
            if (myIntArray[index] % 2 == 0) {
                countEvenNum++;
            } else {
                countOddNum++;
            }
        }
        System.out.println("The total even number in array = " + countEvenNum);
        System.out.println("The total odd number in array = " + countOddNum);

    }
}
