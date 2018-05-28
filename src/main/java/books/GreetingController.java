package books;


import books.domain.ListBooks;
import books.domain.PagerModel;
import books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.Optional;

@Controller
public class GreetingController {
    private static final int BUTTONS_TO_SHOW = 3;
    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 5;
    private static final int[] PAGE_SIZES = { 5, 10};
    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/add")
    public String edit(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "add";
    }

    @PostMapping("/add")
    public ModelAndView add(@RequestParam String title, @RequestParam String description,
                      @RequestParam String author, @RequestParam Integer isbn, @RequestParam Integer printYear,
                      @RequestParam Boolean readAlready, @RequestParam("pageSize") Optional<Integer> pageSize,
                      @RequestParam("page") Optional<Integer> page) {
        if (isbn == null || printYear == null || readAlready == null)
            return homepage(pageSize, page);

        ListBooks message = new ListBooks(title, description, author, isbn, printYear, readAlready);
        booksRepository.save(message);
        return homepage(pageSize, page);
    }

    @GetMapping("/remove/{id}")
    public ModelAndView edit(@PathVariable("id") int id, @RequestParam("pageSize") Optional<Integer> pageSize,
                       @RequestParam("page") Optional<Integer> page) {
        booksRepository.deleteById(id);
        return homepage(pageSize, page);
    }
    @GetMapping
    public ModelAndView homepage(@RequestParam("pageSize") Optional<Integer> pageSize,
                        @RequestParam("page") Optional<Integer> page) {
        ModelAndView modelAndView = new ModelAndView("index");
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        Page<ListBooks> clientlist = booksRepository.findAll(new PageRequest(evalPage, evalPageSize));
        PagerModel pager = new PagerModel(clientlist.getTotalPages(),clientlist.getNumber(),BUTTONS_TO_SHOW);
        modelAndView.addObject("clientlist",clientlist);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", PAGE_SIZES);
        modelAndView.addObject("pager", pager);

        return modelAndView;
    }


    @PostMapping("/title")
    public ModelAndView title(@RequestParam String title, @RequestParam("pageSize") Optional<Integer> pageSize,
                        @RequestParam("page") Optional<Integer> page) {
        ModelAndView modelAndView = new ModelAndView("index");
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        Page<ListBooks> clientlist;
        if (title != null && !title.isEmpty())
          clientlist = booksRepository.findAllByTitle(title, new PageRequest(evalPage, evalPageSize));
        else clientlist = booksRepository.findAll(new PageRequest(evalPage, evalPageSize));
        PagerModel pager = new PagerModel(clientlist.getTotalPages(),clientlist.getNumber(),BUTTONS_TO_SHOW);
        modelAndView.addObject("clientlist",clientlist);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", PAGE_SIZES);
        modelAndView.addObject("pager", pager);
        return modelAndView;
    }

    @PostMapping("/updateUser")
    public ModelAndView updateUser(@ModelAttribute("messages") ListBooks user, @RequestParam("pageSize") Optional<Integer> pageSize,
                             @RequestParam("page") Optional<Integer> page) {
        booksRepository.save(user);
        return homepage(pageSize, page);
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("messages", booksRepository.findById(id));
        return "update";
    }

}