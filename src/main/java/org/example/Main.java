package org.example;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
@Data
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Library libra = new Library();
        Library.LibraryMain();

        int a = 1;


        do {
            menu.MainMenu();
            a = scan.nextInt();


            switch (a) {
                case 1:
                    AuthorEntity Author = new AuthorEntity();
                    scan.nextLine();
                    System.out.println("Введите имя автора ");
                    String name = scan.nextLine();
                    Author.setNameAuthor(name);
                    System.out.println("Введите Фамилию автора ");
                    String Lastname = scan.nextLine();
                    Author.setLastName(Lastname);
                    System.out.println("Введите Отчество автора ");
                    String surenam = scan.nextLine();
                    Author.setSurename(surenam);

                 Library.LibraryMain();

                    break;
                case 2:
                    BookEntity book = new BookEntity();
                    scan.nextLine();
                    System.out.println("Введите  название книги: ");
                    String bookname = scan.nextLine();
                    book.setBookname(bookname);
                    System.out.println("Введите  год книги: ");
                    String bookyear = scan.nextLine();
                    book.setYear(bookyear);



                    break;
                case 3:

                    PublisherEntity Publisher = new PublisherEntity();
                    scan.nextLine();
                    System.out.println("Введите  название издания: ");
                    String publisher = scan.nextLine();
                    Publisher.setNamePublisher(publisher);
                    System.out.println("Введите  город издания: ");
                    String city = scan.nextLine();
                    Publisher.setCity(city);


                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");


            }

            }
            while (a == 5);


        }
    }

