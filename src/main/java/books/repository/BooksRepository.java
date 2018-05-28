package books.repository;

import books.domain.ListBooks;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BooksRepository extends PagingAndSortingRepository<ListBooks, Integer> {
    List<ListBooks> findByTitle(String title);
   // void update(ListBooks listBooks);



    Page<ListBooks>  findAllByTitle(String title, Pageable pageable);
    ListBooks findById(int id);
}
