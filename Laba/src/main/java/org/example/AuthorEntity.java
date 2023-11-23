package org.example;
import org.example.menu;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class AuthorEntity {


    private String nameAuthor;
    private String Surename;
    private String  lastName;


    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurename() {
        return Surename;
    }


}
