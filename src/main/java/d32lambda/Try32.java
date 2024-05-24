package d32lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Try32 {
    public static void main(String[] args) throws IOException {

        //Ornek 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
        System.out.println("------------------------------------------------------------------------");
        Path path = Paths.get("src/main/java/d32lambda/deneme.txt");
        Files.lines(path).forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------");


        //Ornek 2: Verilen text file icindeki text’i buyuk harflerle console’a yazdiran kodu yaziniz.
        Files.lines(path).map(t -> t.toUpperCase()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");


        //Ornek 3: Verilen text file icindeki text'lerde "Veli" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean isThere = Files.lines(path).anyMatch(t -> t.contains("tavşan"));
        System.out.println(isThere);
        System.out.println("-------------------------------------------------------------------------");


        //Ornek 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> differentWords = Files.lines(path).
                map(t -> t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(differentWords);
        System.out.println("--------------------------------------------------------------------------");


        //Ornek 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long howManyLetters = Files.lines(path).map(t -> t.replaceAll("[^a-zA-Z]","").split("")).flatMap(Arrays::stream).count();
        System.out.println(howManyLetters);
        System.out.println("----------------------------------------------------------------------------");


        //Ornek 6: Verilen text file icindeki text’de kullanilan tum harfleri tekrarsiz olarak natural order’da
        //(a’dan z’ye) bir listin icinde return eden kodu yaziniz.
        List<String> differentLetters = Files.lines(path).map(t -> t.replaceAll("[^a-zA-Z]","").split("")).flatMap(Arrays::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(differentLetters);
        System.out.println("-----------------------------------------------------------------------------");










    }
}
