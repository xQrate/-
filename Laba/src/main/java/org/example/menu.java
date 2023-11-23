package org.example;

import lombok.Data;

@Data
public class menu {
    public static void MainMenu(){
        System.out.println("Добро пожаловать в Библиотеку!");
        System.out.println("Выберите действие!");

        System.out.println("Добавление книги:-----(1)");
        System.out.println("Удаление книги:-------(2)");
        System.out.println("Библиотека:-----------(3)");
        System.out.println("Выйти:----------------(4)\n");

        System.out.print("Ввод: ");

    }


}
