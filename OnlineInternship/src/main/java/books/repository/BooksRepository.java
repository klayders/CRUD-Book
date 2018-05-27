package books.repository;

import books.domain.ListBooks;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BooksRepository extends CrudRepository<ListBooks, Integer> {
    List<ListBooks> findByTitle(String title);

    ListBooks findById(int id);
}
