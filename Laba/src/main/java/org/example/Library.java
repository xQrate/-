package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.AuthorEntity;
import java.util.List;
import java.util.ArrayList;


@AllArgsConstructor
@Setter
@Getter
@Data
public class Library {
    private List data;




    public static void LibraryMain() {
        System.out.println("Ваши книги!");


    }


}

