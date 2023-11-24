package org.example;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.AuthorEntity;
import org.example.Library;
import org.example.PublisherEntity;
import org.example.BookEntity;
import java.util.Scanner;
@AllArgsConstructor
@Setter
@Getter
@Data
public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        BookEntity book = new BookEntity();
        AuthorEntity Author = new AuthorEntity();
        PublisherEntity Publisher = new PublisherEntity();


        File file = new File("path/to/file");


        int a = 1;


        do {
            menu.MainMenu();
            a = scan.nextInt();


            switch (a) {
                case 1:
                    //ввод автора

                    scan.nextLine();
                    System.out.printf("Введите имя автора: ");
                     Author.setNameAuthor(scan.nextLine());

                    System.out.printf("Введите Фамилию автора: ");
                     Author.setLastName(scan.nextLine());

                    System.out.printf("Введите Отчество автора: ");
                    Author.setSurename(scan.nextLine());

                    book.setAftor(String.valueOf(Author));
                    System.out.println("Далее заполним книгу!");


                    //Ввод книги

                    //scan.nextLine();
                    System.out.printf("Введите  название книги: ");
                   book.setBookname( scan.nextLine());

                    System.out.printf("Введите  год книги: ");
                    book.setYear(scan.nextLine());

                    System.out.printf("Введите жанр книги: ");
                   book.setGenre(scan.nextLine());

                    System.out.printf("Введите количество страниц книги: ");
                    book.setAmountStr(scan.nextLine());

                    System.out.printf("Введите имя автора: ");
                    book.setAftor(scan.nextLine());

                    System.out.println("Далее заполним издательство!");

                    //ввод издания


                    // scan.nextLine();
                    System.out.printf("Введите  название издания: ");
                   Publisher.setNamePublisher(scan.nextLine());
        book.setPublisher(Publisher);
                    System.out.printf("Введите  город издания: ");
                  Publisher.setCity(scan.nextLine());


                    if (Library.getData() == null) {
                        List temp = new ArrayList<>();
                        temp.add(book);
                        Library.setData(temp);
                        System.out.println(" Книга добавлена!");
                    } else {
                        Library.getData().add(book);
                        System.out.println("Книга добавлена!");
                    }

                    menu.MainMenu();

                    break;

                //удаление
                case 2:


                    if (file.delete()) {
                        System.out.println(file.getName() + " deleted");
                    } else {
                        System.out.println(file.getName() + " not deleted");
                    }
                    break;

                //переход в библиотеку
                case 3:
        Library.LibraryMain();


                    break;
//выход из программы
                case 4:
                    System.out.println("Вы ушли...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");


            }

            }
            while (a == 6);


        }


    }

