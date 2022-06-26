package lab_03;

public class MinMaxValue {

    public static void main(String[] args) {

        int[] myIntArr = {1, 2, 3, 4, 5};
        int minNum = myIntArr[0];
        int maxNum = myIntArr[0];

        for (int index = 0; index < myIntArr.length; index++) {
            // cai vong for nay minh lap theo index, roi lay myIntArr[index] de lay tung phan tu cua list (hoac array) ra do
            // con vong for o bai animal la minh ko can index ma lay truc tiep tung phan tu (animal) ra
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
