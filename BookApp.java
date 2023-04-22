package pl.sdajavapol141.Task01;

import java.util.ArrayList;
import java.util.List;

public class BookApp {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(
                List.of(
                        Book
                                .builder()
                                .title("Java")
                                .author("Bloch")
                                .editionYear(2020)
                                .copies(3)
                                .build(),
                        Book
                                .builder()
                                .title("Spring")
                                .author("Pivotal")
                                .editionYear(2022)
                                .copies(6)
                                .build(),
                        Book
                                .builder()
                                .title("Java for beginners")
                                .author("Freeman")
                                .editionYear(2021)
                                .copies(2)
                                .build(),
                        Book
                                .builder()
                                .title("JDBC")
                                .author("Bloch")
                                .editionYear(2020)
                                .copies(6)
                                .build()
                )
        );
        books.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));
        books.sort((a, b) -> a.getAuthor().compareTo(b.getAuthor()));
        books.sort((a, b) -> a.getEditionYear()-(b.getEditionYear()));

        books.sort((a, b) -> Integer.compare(a.getEditionYear(), b.getEditionYear()));
////        books.sort((a,b)->{
////            if (Integer.compare(a.getEditionYear(),b.getEditionYear()) == 0){
////                return Integer.compare(a.getCopies(),b.getCopies());
////            }else {
////                return Integer.compare()
////            }
//        });
//
//        System.out.println(books);
//
    }
}
