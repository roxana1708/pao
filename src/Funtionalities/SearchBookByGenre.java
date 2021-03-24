package Funtionalities;

import Classes.BookTitle;

import java.util.List;

public class SearchBookByGenre {
    public static void main(List<BookTitle> books, String genre) {
        int no = 0;
        for (BookTitle book : books) {
            if (book.getGenre() == genre) {
                no++;
            }
        }

        System.out.println(no);
        System.out.println();

        BookTitle[] searchByGenre = new BookTitle[no];
        int i = 0;
        for (BookTitle book : books) {
            System.out.println(book.getTitle());
            if (book.getGenre() == genre) {
                searchByGenre[i] = book;
                i++;
            }
        }

        for (BookTitle book : searchByGenre) {
            System.out.println(book.getTitle());
        }
        //return searchByGenre;
    }
}
