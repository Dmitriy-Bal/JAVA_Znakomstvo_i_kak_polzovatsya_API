package org.example.HomeWork.DZ2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Products {
    private String name;
    private String country;
    private Integer weight;
    private Double price;
    private Integer grade;
}