package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Setter
@Getter
@Data



public class Library {
    private List data;

    private List<BookEntity> books;
    public Library() {




    }
}

