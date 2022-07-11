package lab_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void printMenu() {
        System.out.println("======= Book Management Program (CRUD)============\n" +
                "1. New book\n" +
                "2. Find a book(ISBN)\n" +
                "3. Update a book\n" +
                "4. Delete a book\n" +
                "5. Print the book list\n" +
                "0. Exit\n" +
                "====================================================");
    }

    // logic 1 - create new book
    /**
     * Please input ISBN:
     * Please input title:
     * Please input author:
     * Please input year:
     * <p>
     * The book is saved into DB wit info: Book {ISBN, title, author, year}
     */
    ArrayList<Book> arrayList = new ArrayList<>();

    public void createNewBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input ISBN: ");
        String inputISBN = scanner.nextLine();

        System.out.println("Please input title: ");
        String inputTitle = scanner.nextLine();

        System.out.println("Please input author: ");
        String inputAuthor = scanner.nextLine();

        System.out.println("Please input year");
        int inputYear = scanner.nextInt();

        Book book = new Book(inputISBN, inputTitle, inputAuthor, inputYear);
        this.arrayList.add(book);

    }

    // logic 2 - find book

    /**
     * Please input ISBN:
     * If the book found -> print the Book {ISBN, title, author, year}
     * If the book is not found -> Book with ISBN <1234> is not found
     */
    public void findBook() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input ISBN: ");
        String inputISBN = scanner.nextLine();

        boolean isFound = false;
        for (Book book : arrayList) {
            if (inputISBN.equals(book.ISBN)) {
                isFound = true;
                System.out.println(book);
            }
        }
        if (isFound == false) {
            System.out.println("Book with ISBN = " + inputISBN + " is not found");
        }
    }

    // logic 3 - Update book

    /**
     * Please input ISBN: (control if the book is not existing...)
     * Please input new title:
     * Please input new author name:
     * Please input new year:
     * <p>
     * The book is now updated with new content: Book {ISBN, title, author, year}
     */

    public void updateBook() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input ISBN: ");
        String inputISBN = scanner.nextLine();

        boolean isFound = false;
        for (Book book : arrayList) {
            if (inputISBN.equals(book.ISBN)) {
                isFound = true;

                System.out.println("Please input title: ");
                String inputTitle = scanner.nextLine();

                System.out.println("Please input author: ");
                String inputAuthor = scanner.nextLine();

                System.out.println("Please input year");
                int inputYear = scanner.nextInt();

                book.setTitle(inputTitle);
                book.setAuthor(inputAuthor);
                book.setYear(inputYear);

                System.out.println(book);
            }
        }
        if (isFound == false) {
            System.out.println("Book with ISBN = " + inputISBN + " is not found");
        }
        System.out.println(arrayList);
    }

    // logic 4 - delete a book

    /**
     * Please input ISBN: (control if the book is not existing...)
     */

    public void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input ISBN: ");
        String inputISBN = scanner.nextLine();

        boolean isFound = false;
        ArrayList<Book> removeList = new ArrayList();
        for (int index = 0; index < arrayList.size(); index++) {
            Book book = arrayList.get(index);
            if (inputISBN.equals(book.getISBN())) {
                isFound = true;
                removeList.add(book);
            }
        }
        if (isFound == false) {
            System.out.println("Book with ISBN = " + inputISBN + " is not found");
        } else {
            for (Book book : removeList) {
                arrayList.remove(book);
            }
        }
        System.out.println(arrayList);
    }

    public void printListBook() {

    }

}
