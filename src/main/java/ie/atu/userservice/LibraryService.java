package ie.atu.userservice;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class LibraryService {

    private List<Book> library= new ArrayList<>();
    public void addBook(Book book){
        library.add(book);
    }

    public List<Book> getBook(){
        return library;
    }

}
