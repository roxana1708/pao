package Funtionalities;

import Classes.BookTitle;

import java.util.Collections;
import java.util.List;

public class SearchTopBooks {
    public static void main(List<BookTitle> books) {
        Collections.sort(books);
        Collections.reverse(books);
        for (BookTitle book: books) {
            System.out.println(book.getTitle());
        }
    }
}
