package com.everis.d4i.tutorial;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NetflixJava {
    public static void main(String[] args) throws ParseException {
        //Content[] contents = new Content[10];
        List<Content> contents = new ArrayList<>();
        contents.add(new Movie("A Clockwork Orange", LocalDate.of(2020, 10, 10),
                -1, 256754, "Cubrik", 1971));

        contents.add(new Documentary("Blue Planet", LocalDate.of(2020, 12, 06),
                -1, 1234512, "Alastair Fothergill", 2001));

        int seasons = 3;
        List<Seasons> seasonScore = new ArrayList<Seasons>();
        for (int i = 0; i < seasons; i++) {
            seasonScore.add(new Seasons(i + 1, -1));
        }

        contents.add(new Series("Stranger Things", LocalDate.of(2020, 12, 12),
                -1, 12345143, "Netflix", seasons, 2016, seasonScore));

        System.out.println("Ejercicio 1 (Inicialización): ");
        printContent(contents);
        System.out.println("Fin Ejercicio 1.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 2 (Valorar Stranger Things): ");
        ((Series) contents.get(2)).setSeasonScore(8, 0);
        ((Series) contents.get(2)).setSeasonScore(3, 1);
        ((Series) contents.get(2)).setSeasonScore(7, 2);
        printContent(contents);
        System.out.println("Fin Ejercicio 2.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 3 (Cambiar nombre director)");
        ((Movie) contents.get(0)).setDirector("Kubrick");
        printContent(contents);
        System.out.println("Fin Ejercicio 3.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 4 (Hermana mira Notebook y lo registra)");
        contents.add(new Movie("The Notebook", LocalDate.of(2020, 12, 01),
                -1, 123321, "Nick Cassavetes", 2004));
        printContent(contents);
        System.out.println("Fin Ejercicio 4.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 5 (Quitar The Notebook y valorar lo pendiente.)");
        contents.remove(3);

        //Looking for those pending of assessment / rating.
        for (Content cs : contents) {
            Random rn = new Random();
            //Check Content pending of scoring.
            if (cs != null && cs.getScore() == -1) {
                cs.setScore(rn.nextInt(((10 - 1) + 1) + 1));
            }
        }
        printContent(contents);
        System.out.println("Fin Ejercicio 5.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 6 (Añadir dos peliculas de Stephen King)");
        contents.add(new Movie("The Shinning", LocalDate.of(2020, 12, 02),
                8, 987123, "Kubrick", 1980));

        contents.add(new Movie("Pet Sematary", LocalDate.of(2020, 12, 03),
                5, 987123, "Kevin Kolsch, Dennis Widmyer", 2019));

        printContent(contents);

        System.out.println("Fin Ejercicio 6.");
        System.out.println("/////////////////\n");


        System.out.println("Ejericio 7 (Filtro por valoración)");

        List<Content> filteredContent = filterContent(contents);
        printContent(filteredContent);

        System.out.println("Fin Ejercicio 7.");
        System.out.println("/////////////////\n");
    }

    private static void printContent(List<Content> contents) {
        for (Content c : contents) {
            if (c != null)
                System.out.println(c);
        }
    }

    private static double calacAverage(double[] seasonScore) {
        int count = 0;
        double score = 0;
        for (double sc : seasonScore) {
            score += sc;
            count++;
        }
        return score / count;
    }

    private static List<Content> filterContent(List<Content> contents) {
        List<Content> filtered = new ArrayList<Content>();
        for (int i = 0, j = 0; i < contents.size(); i++) {
            if (contents.get(i) != null && contents.get(i).getScore() >= 5) {
                filtered.add(contents.get(i));
                j++;
            }
        }
        return filtered;
    }

    private static Content[] rateUnratedContent(Content[] contents) {

        return contents;
    }

}
