package Utilities;

import java.time.LocalDate;

/**
 * A class to model books
 */
public class Book {

    // Class Member variables
    private final int id;
    private final String title;
    private final LocalDate datePublished;

    /**
     * Constructor method
     *
     * @param id
     * @param title
     * @param datePublished
     */
    public Book(int id, String title, LocalDate datePublished) {
        this.id = id;
        this.title = title;
        this.datePublished = datePublished;
    }

    // Getters

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}
