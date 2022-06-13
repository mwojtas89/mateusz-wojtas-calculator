package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Creating novels list
        Library library = new Library("Novels");
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n -> library.getBooks().add(new Book("Novel" + n, "Author" + n, LocalDate.of(1991 + n,1, 2))));

        //creating a shallow copy of Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Novels_shallow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //creating a deepCopy of Library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Novels_deep");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Book removeBook = new Book("Novel1", "Author1",LocalDate.of(1992,1,2));
        library.getBooks().remove(removeBook);

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assertions.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assertions.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
