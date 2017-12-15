package entities;


import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String author;
    String isbn;
    String topic;
    @Column(name = "nr_of_pages")
    String nrOfPages;
    boolean inStock;

}
