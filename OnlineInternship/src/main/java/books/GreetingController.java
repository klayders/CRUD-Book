package books;


import books.domain.ListBooks;
import books.repository.BooksRepository;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<ListBooks> messages = booksRepository.findAll();

        model.put("messages", messages);

        return "main";
    }
    @PostMapping
    public String add(@RequestParam String title,@RequestParam String description,
                      @RequestParam String author, @RequestParam Integer isbn, @RequestParam Integer printYear,
                      @RequestParam Integer readAlready, Map<String, Object> model) {
        ListBooks message = new ListBooks(title, description, author, isbn, printYear, readAlready);

        booksRepository.save(message);

        Iterable<ListBooks> messages = booksRepository.findAll();

        model.put("messages", messages);

        return "main";
    }

    @PostMapping("title")
    public String title(@RequestParam String title, Map<String, Object> model) {
        Iterable<ListBooks> messages;

        if (title != null && !title.isEmpty()) {
            messages = booksRepository.findByTitle(title);
        } else {
            messages = booksRepository.findAll();
        }

        model.put("messages", messages);

        return "main";
    }
    @PostMapping("remove")
    public String remove(@RequestParam Integer id,  Map<String, Object> model) {
        Iterable<ListBooks> messages = booksRepository.findAll();
    if (booksRepository.existsById(id)) {
        booksRepository.deleteById(id);
        messages = booksRepository.findAll();
    }
        model.put("messages", messages);
        return "main";
    }
    @PostMapping("edit")
    public String edit(@RequestParam Integer id,  @RequestParam String title,@RequestParam String description,
                       @RequestParam String author, @RequestParam Integer isbn, @RequestParam Integer printYear,
                       @RequestParam Integer readAlready, Map<String, Object> model) {
        if (booksRepository.existsById(id)) {
            ListBooks listBooks = booksRepository.findById((int)id);
            listBooks.setTitle(title);
            listBooks.setDescription(description);
            listBooks.setAuthor(author);
            listBooks.setIsbn(isbn);
            listBooks.setPrintYear(printYear);
            listBooks.setReadAlready(readAlready);
            booksRepository.save(listBooks);

        }
        Iterable<ListBooks> messages = booksRepository.findAll();

        model.put("messages", messages);
        return "main";
    }
}