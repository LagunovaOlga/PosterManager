package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    Manager manager = new Manager();

    @Test
    public void shouldAddFilm0() {

        Poster[] expected = new Poster[0];
        Poster[] actual = manager.findAll();
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected,actual);
    }


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
        manager.addFilm(new Poster(1));
        manager.addFilm(new Poster(2));
        manager.addFilm(new Poster(3));
        manager.addFilm(new Poster(4));
        manager.addFilm(new Poster(5));
        manager.addFilm(new Poster(6));
        manager.addFilm(new Poster(7));
        manager.addFilm(new Poster(8));
        manager.addFilm(new Poster(9));
        manager.addFilm(new Poster(10));
        manager.addFilm(new Poster(11));


        Poster[] expected = {(new Poster(11)),(new Poster(10)),
                (new Poster(9)),(new Poster(8)),(new Poster(7)),(new Poster(6)),(new Poster(5)),
                (new Poster(4)),(new Poster(3)),(new Poster(2))};
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldFindLast9() {
        Manager manager = new Manager(9);
        manager.addFilm(new Poster(1));
        manager.addFilm(new Poster(2));
        manager.addFilm(new Poster(3));
        manager.addFilm(new Poster(4));
        manager.addFilm(new Poster(5));
        manager.addFilm(new Poster(6));
        manager.addFilm(new Poster(7));
        manager.addFilm(new Poster(8));
        manager.addFilm(new Poster(9));
        manager.addFilm(new Poster(10));

        Poster[] expected = {(new Poster(10)),(new Poster(9)),
                (new Poster(8)),(new Poster(7)),(new Poster(6)),(new Poster(5)),(new Poster(4)),
                (new Poster(3)),(new Poster(2))};
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldFindLast1() {
        Manager manager = new Manager(1);
        manager.addFilm(new Poster(1));
        manager.addFilm(new Poster(2));
        manager.addFilm(new Poster(3));
        manager.addFilm(new Poster(4));
        manager.addFilm(new Poster(5));
        manager.addFilm(new Poster(6));
        manager.addFilm(new Poster(7));


        Poster[] expected = {(new Poster(7))};
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldFindLast() {
        Manager manager = new Manager(5);
        manager.addFilm(new Poster(1));
        manager.addFilm(new Poster(2));
        manager.addFilm(new Poster(3));

        Poster[] expected = {(new Poster(3)),(new Poster(2)),(new Poster(1))};
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldFindLast5() {
        Manager manager = new Manager(7);

        Poster[] expected = new Poster[0];
        System.out.println(Arrays.toString(manager.findLast()));
        Assertions.assertArrayEquals(expected, manager.findLast());
    }


}
