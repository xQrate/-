package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;

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
    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner scan = new Scanner(System.in);
        Library libr = new Library();
        BookEntity book = new BookEntity();
        AuthorEntity Author = new AuthorEntity();
        PublisherEntity Publisher = new PublisherEntity();
        Gson gson = new Gson();


        try {
            FileReader reader = new FileReader("./fileForJson.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int answer = 0;

        do {
            menu.MainMenu();
            answer = scan.nextInt();
//                try {
//                answer = Integer.parseInt(scan.nextLine());

            switch (answer) {
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
                    System.out.println("\nДалее заполним книгу!");


                    //Ввод книги

                    //scan.nextLine();
                    System.out.printf("Введите  название книги: ");
                    book.setBookname(scan.nextLine());
                    System.out.printf("Введите жанр книги: ");
                    book.setGenre(scan.nextLine());

                    System.out.printf("Введите  год книги: ");
                    book.setYear(scan.nextInt());



                    scan.nextLine();

                    System.out.printf("Введите количество страниц книги: ");
                    book.setAmountStr(scan.nextInt());

//                        System.out.printf("Введите имя автора: ");
//                        book.setAftor(scan.nextLine());

                    System.out.println("\nДалее заполним издательство!");

                    //ввод издания


                    // scan.nextLine();
                    System.out.printf("Введите  название издания: ");
                    Publisher.setNamePublisher(scan.nextLine());
                    book.setPublisher(Publisher);
                    scan.nextLine();
                    System.out.printf("Введите  город издания: ");
                    Publisher.setCity(scan.nextLine());


                    if (libr.getData() == null) {
                        List temp = new ArrayList<>();
                        temp.add(book);
                        libr.setData(temp);
                        System.out.println("\n Книга добавлена!");
                    } else {
                        libr.getData().add(book);
                        System.out.println("\nКнига добавлена!");
                    }


                    break;

                //удаление
                case 2:


                    break;

                //переход в библиотеку
                case 3:
                    System.out.println("В ассортименте имеются:\n");
                    try {
                        File fileForJson = new File("./fileForJson.txt");
                        if (!fileForJson.exists())
                            fileForJson.createNewFile();
                        FileWriter fw;
                        fw = new FileWriter(fileForJson);

                        fw.write(gson.toJson(libr));
                        fw.close();
                        System.out.println("Запись завершена.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ;
                    if (libr.getData() == null) {
                        System.out.println("\uD83D\uDD78 Библиотека пуста! \uD83D\uDD78");
                    } else libr.getData().forEach(System.out::println);


                    break;


                //поиск

                case 4:
                    break;

//запись
                case 5:
                    try {
                        File fileForJson = new File("./fileForJson.txt");
                        if (!fileForJson.exists())
                            fileForJson.createNewFile();
                        FileWriter fw;
                        fw = new FileWriter(fileForJson);
                        fw.write(gson.toJson(libr));
                        fw.close();
                        System.out.println("Запись завершена!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //выход из программы
                case 6:
                    System.out.println("Вы ушли...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");


            }

//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка ввода ");
//            }
        }
        while (answer != 7);
    }

}









