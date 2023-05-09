package ru.job4j.accidents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Основной класс для запуска приложения
 *
 * @author Alexander Emelyanov
 * @version 1.0
 */
@SpringBootApplication
public class Application {

    /**
     * Выполняет запуск приложения
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Go to http://localhost:8080");

    }
}
