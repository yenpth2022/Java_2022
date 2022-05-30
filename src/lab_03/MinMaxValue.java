package lab_03;

public class MinMaxValue {

    public static void main(String[] args) {

        int[] myIntArr = {1, 2, 3, 4, 5};
        int minNum = myIntArr[0];
        int maxNum = myIntArr[0];

        for (int index = 0; index < myIntArr.length; index++) {
            if (myIntArr[index] < minNum) {
                minNum = myIntArr[index];
            } else {
                maxNum = myIntArr[index];
            }
        }
        System.out.println("The min number in array = " + minNum);
        System.out.println("The max number in array = " +maxNum);

    }
}
