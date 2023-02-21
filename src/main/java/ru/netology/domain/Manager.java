package ru.netology.domain;

public class Manager {

    private Poster[] films = new Poster[0];
    private int maxFilmNumber = 10;

    public Manager() {
    }

    public Manager(int maxFilmNumber) {

        this.maxFilmNumber = maxFilmNumber;
    }


    public void addFilm(Poster film) {
        Poster[] tmp = new Poster[films.length + 1];
        /* второй вариант записи метода
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        films = tmp;
         */
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Poster[] findAll() {
        return films;
    }

    public Poster[] findLast() {
        /* второй вариант записи этого метода
        int length = Math.min(films.length,maxFilmNumber);
        Poster[] result = new Poster[length];
         */
        int resultLength;
        if (films.length < maxFilmNumber) {
            resultLength = films.length;
        } else  {
            resultLength = maxFilmNumber;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }


}
