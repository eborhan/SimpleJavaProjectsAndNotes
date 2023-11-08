import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Books> bookList = new ArrayList<>();
        bookList.add(new Books("İçimzideki Şeytan", 268, "Sabahattin Ali", 2016));
        bookList.add(new Books("Beyaz Zambaklar Ülkesinde", 140, " Grigory Petrov", 2020));
        bookList.add(new Books("1984", 352, "George Orwell", 2020));
        bookList.add(new Books("Bu Ülke", 339, "Cemil Meric", 2018));
        bookList.add(new Books("Hayvan Çiftliği", 152, "George Orwell", 2020));
        bookList.add(new Books("Dönüşüm", 160, "Franz Kafka", 2016));
        bookList.add(new Books("Zübük", 272, "Aziz Nesin", 2005));
        bookList.add(new Books("Ve Dağlar Yankılandı", 424, "Khaled Hosseini", 2013));
        bookList.add(new Books("Kumarbaz", 192, "Dostoyevski", 2012));
        bookList.add(new Books("Savaş ve Barış", 1883, "Lev Tolstoy", 2015));

        System.out.println("*--------------------------------------*");
        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getBookTitle(), book.getAuthor()));
        for (String i : bookMap.keySet()) {
            System.out.println("Book Name: " + i + "\nAuthorName: " + bookMap.get(i));
        }
        System.out.println("*--------------------------------------*");
        // filter
        List<Books> listBook = bookList.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        listBook.stream().forEach(b -> System.out.println("Book name : " + b.getBookTitle() + "  " +
                "Page Number : " + b.getPageNumber() + "  " +
                "Author : " + b.getAuthor() + "  " +
                "ReleaseDate : " + b.getPubDate()));

        System.out.println("*--------------------------------------*");

        // to view the total number of books
        long count = bookList.stream().count();
        System.out.println("Number of books: " + count);
    }
}