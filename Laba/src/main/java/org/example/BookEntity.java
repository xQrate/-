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
    private String year;
    private String genre;
    private String amountStr;

    private String aftor;

    public String toString() {
        return "Книга - " +
                "Название: '" + Bookname +
                "Жанр: " + genre +
                "Количество страниц: " + amountStr +
                "Дата публикации: " + year +
                "Автор: " + aftor.toString() +
                "  " +  publisher.toString();
    }
}