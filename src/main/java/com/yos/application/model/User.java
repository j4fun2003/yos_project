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
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String avatar;

    private Boolean gender;

    private LocalDateTime birthday;

    private String address;

    private String phoneNumber;

    private LocalDateTime createDate;

    private Boolean isActive;

    @OneToMany(mappedBy = "user")
    List<Favourite> favourites;

    @OneToMany(mappedBy = "user")
    List<UserRole> userRoles;

    @OneToMany(mappedBy = "user")
    List<Order> orders;

    @OneToMany(mappedBy = "user")
    List<Rate> rates;


}
