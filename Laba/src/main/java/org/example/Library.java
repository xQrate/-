package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.AuthorEntity;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@Data
public class Library {

    public static void LibraryMain() {

        ArrayList<String> info = new ArrayList<String>();
        System.out.println("Ваши книги!");

        int b = info.size();
        System.out.println(b);
        for (int c = 1; c != 8; ) {
            System.out.println(info.get(c));
            c++;

        }


    }

}

