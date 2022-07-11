package lab_14;
import java.util.ArrayList;
import java.util.Scanner;
import static lab_14.Controller.printMenu;

public class TestBook {

    public static void main(String[] args) {

        Controller controller = new Controller();

        boolean isContinuing = true;
        while (isContinuing == true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your option: ");
            String inputUser = scanner.nextLine();

            switch (inputUser) {
                case "0":
                    isContinuing = false;
                    System.out.println("See you again");
                    break;
                case "1":
                    controller.createNewBook();
                    System.out.println(controller.arrayList);
                    break;
                case "2":
                    controller.findBook();
                    break;
                case "3":
                    controller.updateBook();
                    break;
                case "4":
                    controller.deleteBook();
                    break;
                case "5":

                    break;
                default:
                    System.out.println("Invalid option, please re-enter");
                    break;

            }
        }


    }
}
