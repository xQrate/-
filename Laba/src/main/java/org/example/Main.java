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


        int a = 1;
        ArrayList <String> info = new ArrayList<String>();

        do {
            menu.MainMenu();
            a = scan.nextInt();


            switch (a) {
                case 1:
                    //ввод автора
                    AuthorEntity Author = new AuthorEntity();
                    scan.nextLine();
                    System.out.printf("Введите имя автора: ");
                    String name = scan.nextLine();
                    Author.setNameAuthor(name);
                    System.out.printf("Введите Фамилию автора: ");
                    String Lastname = scan.nextLine();
                    Author.setLastName(Lastname);
                    System.out.printf("Введите Отчество автора: ");
                    String surenam = scan.nextLine();
                    Author.setSurename(surenam);
                    System.out.println("Далее заполним книгу!");


                    //Ввод книги
                    BookEntity book = new BookEntity();
                    //scan.nextLine();
                    System.out.printf("Введите  название книги: ");
                    String bookname = scan.nextLine();
                    book.setBookname(bookname);
                    System.out.printf("Введите  год книги: ");
                    String bookyear = scan.nextLine();
                    book.setYear(bookyear);
                    System.out.printf("Введите жанр книги: ");
                    String bookgenre = scan.nextLine();
                    System.out.println("Далее заполним издательство!");

                    //ввод издания

                    PublisherEntity Publisher = new PublisherEntity();
                    // scan.nextLine();
                    System.out.printf("Введите  название издания: ");
                    String publisher = scan.nextLine();
                    Publisher.setNamePublisher(publisher);
                    System.out.printf("Введите  город издания: ");
                    String city = scan.nextLine();
                    Publisher.setCity(city);

                    info.set(0,name);
                    info.set(1,Lastname);
                    info.set(2,surenam);
                    info.set(3,bookname);
                    info.set(4,bookgenre);
                    info.set(5,bookyear);
                    info.set(6,publisher);
                    info.set(7,city);

                    Library.LibraryMain();
                    break;

                //удаление
                case 2:


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
            while (a == 5);


        }
    }

