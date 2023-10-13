package ie.atu.userservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService){
        this.libraryService = libraryService;
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        libraryService.addBook(book);
        return "Book Added";

    }

    @GetMapping("/getBook")
    public @ResponseBody List<Book> getBooks(){
        return libraryService.getBook();
    }
}