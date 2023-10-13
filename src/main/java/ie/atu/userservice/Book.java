package ie.atu.userservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private String Author;
    private String isbn;
    private String title;
    private int publishedYear;
}
