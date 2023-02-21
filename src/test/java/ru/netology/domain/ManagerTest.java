package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    Manager manager = new Manager();

    @Test
    public void shouldAddFilm1() {
        manager.addFilm(new Poster(1, "Бладшот"));

        Poster[] expected = {(new Poster(1, "Бладшот"))};
        Poster[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);
    }


    @Test
    public void shouldAddFilm3() {
        manager.addFilm(new Poster(1, "Бладшот"));
        manager.addFilm(new Poster(2, "Вперёд"));
        manager.addFilm(new Poster(3, "Отель Белград"));

        Poster[] expected = {(new Poster(1, "Бладшот")),(new Poster(2, "Вперёд")),
                (new Poster(3, "Отель Белград"))};
        Poster[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldFindMaxLast() {
        manager.addFilm(new Poster(1, "Бладшот"));
        manager.addFilm(new Poster(2, "Вперёд"));
        manager.addFilm(new Poster(3, "Отель Белград"));
        manager.addFilm(new Poster(4, "Джентельмены"));
        manager.addFilm(new Poster(5, "Челокев-невидимка"));
        manager.addFilm(new Poster(6, "тролли. Мировой тур"));
        manager.addFilm(new Poster(7, "Номер один"));
        manager.addFilm(new Poster(8));
        manager.addFilm(new Poster(9));
        manager.addFilm(new Poster(10));

        Poster[] actual = manager.findLast();
        System.out.println(Arrays.toString(actual));
        assertEquals(10, actual.length);
    }
    @Test
    public void shouldFindLast9() {
        Manager manager = new Manager(9);
        manager.addFilm(new Poster(1, "Бладшот"));
        manager.addFilm(new Poster(2, "Вперёд"));
        manager.addFilm(new Poster(3, "Отель Белград"));
        manager.addFilm(new Poster(4, "Джентельмены"));
        manager.addFilm(new Poster(5, "Челокев-невидимка"));
        manager.addFilm(new Poster(6, "тролли. Мировой тур"));
        manager.addFilm(new Poster(7, "Номер один"));
        manager.addFilm(new Poster(8));
        manager.addFilm(new Poster(9));
        manager.addFilm(new Poster(10));

        Poster[] actual = manager.findLast();
        System.out.println(Arrays.toString(actual));
        assertEquals(9, actual.length);
    }
    @Test
    public void shouldFindLast1() {
        Manager manager = new Manager(1);
        manager.addFilm(new Poster(1, "Бладшот"));
        manager.addFilm(new Poster(2, "Вперёд"));
        manager.addFilm(new Poster(3, "Отель Белград"));
        manager.addFilm(new Poster(4, "Джентельмены"));
        manager.addFilm(new Poster(5, "Челокев-невидимка"));
        manager.addFilm(new Poster(6, "тролли. Мировой тур"));
        manager.addFilm(new Poster(7, "Номер один"));
        manager.addFilm(new Poster(8));
        manager.addFilm(new Poster(9));
        manager.addFilm(new Poster(10));

        Poster[] actual = manager.findLast();
        System.out.println(Arrays.toString(actual));
        assertEquals(1, actual.length);
    }
    @Test
    public void shouldFindLast2() {
        Manager manager = new Manager(2);
        manager.addFilm(new Poster(1, "Бладшот"));
        manager.addFilm(new Poster(2, "Вперёд"));
        manager.addFilm(new Poster(3, "Отель Белград"));
        manager.addFilm(new Poster(4, "Джентельмены"));
        manager.addFilm(new Poster(5, "Челокев-невидимка"));
        manager.addFilm(new Poster(6, "тролли. Мировой тур"));
        manager.addFilm(new Poster(7, "Номер один"));
        manager.addFilm(new Poster(8));
        manager.addFilm(new Poster(9));
        manager.addFilm(new Poster(10));

        Poster[] actual = manager.findLast();
        System.out.println(Arrays.toString(actual));
        assertEquals(2, actual.length);
    }
    @Test
    public void shouldFindLast5() {
        Manager manager = new Manager(5);
        manager.addFilm(new Poster(1, "Бладшот"));
        manager.addFilm(new Poster(2, "Вперёд"));
        manager.addFilm(new Poster(3, "Отель Белград"));
        manager.addFilm(new Poster(4, "Джентельмены"));
        manager.addFilm(new Poster(5, "Челокев-невидимка"));
        manager.addFilm(new Poster(6, "тролли. Мировой тур"));
        manager.addFilm(new Poster(7, "Номер один"));
        manager.addFilm(new Poster(8));
        manager.addFilm(new Poster(9));
        manager.addFilm(new Poster(10));

        Poster[] actual = manager.findLast();
        System.out.println(Arrays.toString(actual));
        assertEquals(5, actual.length);
    }



}
