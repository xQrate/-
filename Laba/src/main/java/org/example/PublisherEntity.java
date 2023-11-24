package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class PublisherEntity {
    private String NamePublisher;
    private String City;

    @Override
    public String toString() {
        return "издательство:" + NamePublisher + " - " + City;
    }

}
