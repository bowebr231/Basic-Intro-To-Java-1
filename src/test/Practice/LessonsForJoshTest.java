package Practice;

import Utilities.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

/**
 * List of JUNIT5 unit tests to test the function stubs located in LessonsForJosh class
 */
class LessonsForJoshTest {

    private static final Book[] library = new Book[5];

    private static final int STAR_WARS = 0;
    private static final int HARRY_POTTER = 1;
    private static final int FLIES = 2;
    private static final int PROGRAMMER = 3;
    private static final int ANIMORPHS = 4;

    @BeforeAll
    static void setup() {
        library[STAR_WARS] = new Book(1, "Star Wars", LocalDate.of(1978, Month.JULY, 21));
        library[HARRY_POTTER] = new Book(23, "Harry Potter", LocalDate.of(1997, Month.JUNE, 26));
        library[FLIES] = new Book(5, "Lord of the Flies", LocalDate.of(1954, Month.SEPTEMBER, 17));
        library[PROGRAMMER] = new Book(77, "The Pragmatic Programmer: Your Journey To Mastery, 20th Anniversary Edition (2nd Edition)", LocalDate.of(2019, Month.SEPTEMBER, 13));
        library[ANIMORPHS] = new Book(76, "Animorphs: The Invasion", LocalDate.of(1996, Month.JUNE, 1));
    }

    @Test
    void mainTest() {
        // TODO: create function tests
        assertTrue(true); // defaults to pass for now
    }

    @Test
    void combineStrings() {
        String actual = LessonsForJosh.combineStrings("Cat", "Dog");
        String expected = "CatDog";
        assertEquals(expected, actual);
    }

    @Test
    void findBookById() {

        for (Book book : library)
        {
            Book actual = LessonsForJosh.findBookById(book.getId(), library);
            Book expected = book;
            assertEquals(expected, actual);
        }

    }

    @Test
    void testFindBookByTitle() {

        for (Book book : library)
        {
            Book actual = LessonsForJosh.findBookByTitle(book.getTitle(), library);
            Book expected = book;
            assertEquals(expected, actual);
        }

    }

    @Test
    void findBooksPublishedAfterDate() {

        LocalDate date = LocalDate.of(1955, Month.FEBRUARY, 1);
        Book[] actual = LessonsForJosh.findBooksPublishedAfterDate(date, library);
        Book[] expected = new Book[] {library[STAR_WARS], library[ANIMORPHS], library[HARRY_POTTER], library[PROGRAMMER]};
        assertEquals(expected, actual);

    }

    @Test
    void sortBooksByID() {
        Book[] libraryCopy = library.clone();
        Book[] actual = LessonsForJosh.sortBooksByID(libraryCopy);
        Book[] expected = new Book[] {library[STAR_WARS], library[FLIES], library[HARRY_POTTER], library[ANIMORPHS], library[PROGRAMMER]};
        assertEquals(expected, actual);

    }

    @Test
    void sortBooksByDate() {
        Book[] libraryCopy = library.clone();
        Book[] actual = LessonsForJosh.sortBooksByDate(libraryCopy);
        Book[] expected = new Book[] {library[FLIES], library[STAR_WARS], library[HARRY_POTTER], library[ANIMORPHS], library[PROGRAMMER]};
        assertEquals(expected, actual);
    }

    @Test
    void sortBooksByTitle() {
        Book[] libraryCopy = library.clone();
        Book[] actual = LessonsForJosh.sortBooksByTitle(libraryCopy);
        Book[] expected = new Book[] {library[ANIMORPHS], library[FLIES], library[HARRY_POTTER], library[PROGRAMMER], library[STAR_WARS]};
        assertEquals(expected, actual);
    }

}