package org.example;

import lombok.Data;

@Data
public class menu {
    public static void MainMenu(){

        System.out.println("\nДобро пожаловать в Библиотеку!\n");
        System.out.println("Выберите действие!\n");

        System.out.println("Добавление книги:-----(1)");
        System.out.println("Удаление книги:-------(2)");
        System.out.println("Библиотека:-----------(3)");
        System.out.println("Поиск:----------------(4)");
        System.out.println("Запись:---------------(5)");
        System.out.println("Выйти:----------------(6)\n");

        System.out.print("Ввод: ");

    }


}
