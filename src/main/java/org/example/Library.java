package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.AuthorEntity;
@Getter
@Setter

@Data
public class Library {
    public static void LibraryMain() {
        AuthorEntity Author = new AuthorEntity();
        System.out.println("Результат");
        Author.getNameAuthor();
        System.out.println();

    }
}

