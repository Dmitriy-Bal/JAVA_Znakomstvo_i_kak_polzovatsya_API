package org.example.HomeWork.DZ3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pages;
}
