package com.example.libaraymanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Integer id;
    private String isbn;
    private String title;
    private String category;
    private Integer price;
    private Integer qty;
}
