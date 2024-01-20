package com.yos.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long first_price;

    private Long price;

    private Long discount;

    private String description;

    private LocalDateTime create_date;

//    @OneToMany(mappedBy = "product")
//    private List<Category> categories;

    private String category;

    @OneToMany(mappedBy = "product")
    private List<Favourite> favourites;

    @OneToMany(mappedBy = "product")
    private List<ProductColorSize> productColorSizes;

    @OneToMany(mappedBy = "product")
    private List<Rate> rates;

}
