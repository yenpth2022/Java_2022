package lab_03;

public class AscSortArray {

    public static void main(String[] args) {

//        Input: {12, 34, 1, 16, 28}
//        Expected output: {1, 12, 16, 28, 34}
        int[] myIntArray = {12, 34, 1, 16, 28};
        int temp;

        for (int j = 0; j < myIntArray.length; j++) {
            for (int index = 0; index < j; index++) {
                if (myIntArray[index] > myIntArray[index + 1]) {
                    temp = myIntArray[index];
                    myIntArray[index] = myIntArray[index + 1];
                    myIntArray[index + 1] = temp;
                }
            }
        }
        System.out.println("Output:");
        for (int index = 0; index < myIntArray.length; index++) {
            System.out.print(myIntArray[index]+", ");
        }
    }
}
