package org.example.HomeWork.DZ1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private Double price;
    private Integer grade;
}
