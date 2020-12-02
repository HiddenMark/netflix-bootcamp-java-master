package com.everis.d4i.tutorial;

import java.text.ParseException;
import java.util.*;

public class NetflixJava
{
    public static void main(String[] args) throws ParseException {
        Content[] contents = new Content[10];
        contents[0] = new Movie("A Clockwork Orange",new Date(2020 - 1900,9,10) ,
                -1, 256754, "Cubrik",1971);

        contents[1] = new Documentary("Blue Planet", new Date(2020 - 1900, 10, 06),
                -1, 1234512, "Alastair Fothergill", 2001);

        int seasons = 3;
        double[] seasonScore = new double[seasons];
        for(int i = 0; i<seasonScore.length; i++){ seasonScore[i] = -1;}

        contents[2] = new Series("Stranger Things", new Date(2020 - 1900, 11, 12),
                -1, 12345143, "Netflix", seasons, 2016, seasonScore);

        System.out.println("Ejercicio 1 (Inicialización): ");
        printContent(contents);
        System.out.println("Fin Ejercicio 1.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 2 (Valorar Stranger Things): ");
        ((Series)contents[2]).setSeasonScore(8,0);
        ((Series)contents[2]).setSeasonScore(3,1);
        ((Series)contents[2]).setSeasonScore(7,2);
        contents[2].setScore(((Series)contents[2]).getAverageScore());
        printContent(contents);
        System.out.println("Fin Ejercicio 2.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 3 (Cambiar nombre director)");
        ((Movie)contents[0]).setDirector("Kubrick");
        printContent(contents);
        System.out.println("Fin Ejercicio 3.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 4 (Hermana mira Notebook y lo registra)");
        contents[3] = new Movie("The Notebook", new Date(2020 - 1900, 11, 01),
                -1, 123321,"Nick Cassavetes", 2004);
        printContent(contents);
        System.out.println("Fin Ejercicio 4.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 5 (Quitar The Notebook y valorar lo pendiente.)");
        contents = removeContent(contents, 3);

        //Looking for those pending of assessment / rating.
        for(Content cs : contents)
        {
            Random rn = new Random();
            //Checks if it's a Movie or Documentary, and if it hasn't been rated yet, and if so generates a random score.
            if(cs != null && cs.getScore() == -1 && (cs instanceof Movie || cs instanceof Documentary))
            {
                cs.setScore(rn.nextInt(((10 - 1) + 1) + 1));
            } else if (cs instanceof Series)
            {
                //Checks if it's a Series and rates the season that hasn't been rated yet.
                for (int i = 0; i<((Series)cs).getSeasons(); i++)
                {
                    Series series = (Series)cs;
                    if(series.getSpecificSeasonScore(i) == -1)
                    {
                        cs.setScore(rn.nextInt(((10 - 1) + 1) + 1));
                    }
                }
            }
        }
        printContent(contents);
        System.out.println("Fin Ejercicio 5.");
        System.out.println("/////////////////\n");

        System.out.println("Ejercicio 6 (Añadir dos peliculas de Stephen King)");
        contents[3] = new Movie("The Shinning", new Date(2020 - 1900, 11, 02),
                8, 987123, "Kubrick", 1980);

        contents[4] = new Movie("Pet Sematary", new Date(2020 - 1900, 11, 03),
                5, 987123, "Kevin Kolsch, Dennis Widmyer", 2019);

        printContent(contents);

        System.out.println("Fin Ejercicio 6.");
        System.out.println("/////////////////\n");


        System.out.println("Ejericio 7 (Filtro por valoración)");

        Content[] filteredContent = filterContent(contents);
        printContent(filteredContent);

        System.out.println("Fin Ejercicio 7.");
        System.out.println("/////////////////\n");
    }

    private static void printContent(Content[] contents)
    {
        for(Content c : contents)
        {
            if(c != null)
            System.out.println(c);
        }
    }

    private static double calacAverage(double[] seasonScore)
    {
        int count = 0;
        double score = 0;
        for (double sc : seasonScore)
        {
            score += sc;
            count++;
        }
        return score / count;
    }

    private static Content[] removeContent(Content[] contents, int index)
    {
        Content[] copy = new Content[contents.length - 1];
        for(int i = 0, j=0; i< contents.length; i++)
        {
            if(i != index)
            {
                copy[j] = contents[i];
                j++;
            }
        }
        return copy;
    }

    private static Content[] filterContent(Content[] contents)
    {
        Content[] filtered = new Content[contents.length];
        for(int i = 0, j=0; i<contents.length; i++)
        {
            if(contents[i] != null && contents[i].getScore() >= 5)
            {
                filtered[j] = contents[i];
                j++;
            }
        }
        return filtered;
    }

    private static Content[] rateUnratedContent(Content[] contents)
    {

        return contents;
    }

}
