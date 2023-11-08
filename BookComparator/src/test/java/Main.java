import java.awt.print.Book;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Books> books = new TreeSet<>();

        books.add(new Books("İçimzideki Şeytan", 268, "Sabahattin Ali", 2016));
        books.add(new Books("Hayvan Çiftliği", 152, "George Orwell", 2020));
        books.add(new Books("1984", 352, "George Orwell", 2018));
        books.add(new Books("Beyaz Zambaklar Ülkesinde", 140, "Grigory Petrov", 2018));
        books.add(new Books("Zübük", 272, "Aziz Nesin", 2005));

        for (Books book : books) {
            System.out.println(book.getBookTitle());
        }

        System.out.println("------------------------------------");

        TreeSet<Books> books2 = new TreeSet<>(new Comparator<Books>() {
            @Override
            public int compare(Books o1, Books o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        books2.addAll(books);

        for (Books book : books2) {
            System.out.println(book.getBookTitle());

        }

    }
}

