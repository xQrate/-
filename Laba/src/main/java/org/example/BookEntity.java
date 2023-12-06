package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Flow;

@Data
@Setter
@Getter
public class BookEntity {
    PublisherEntity publisher = new PublisherEntity();
    private String Bookname;
    private int year;
    private String genre;
    private int amountStr;
    private String aftor;

    @Override
    public String toString() {
        return "Книга  " +
                "\nНазвание:  " + " " + Bookname +
                "\nЖанр: " + genre +
                "\nКоличество страниц: " + " " + amountStr +
                "\nДата публикации(Год): " + " " + year +
                "\nАвтор: " + " " + aftor.toString() +
                " " + " " + publisher.toString();
    }
}