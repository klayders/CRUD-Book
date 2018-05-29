package books.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListBooks {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String title;

    private String description;

    private String author;

    private String isbn;

    private Integer printYear;

    private Boolean readAlready;

    public ListBooks() {
    }

    public ListBooks(String title, String description, String author, String isbn, int printYear, Boolean readAlready) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.isbn = isbn;
        this.printYear = printYear;
        this.readAlready = readAlready;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPrintYear() {
        return printYear;
    }

    public void setPrintYear(Integer printYear) {
        this.printYear = printYear;
    }

    public Boolean getReadAlready() {
        return readAlready;
    }

    public void setReadAlready(Boolean readAlready) {
        this.readAlready = readAlready;
    }
}
