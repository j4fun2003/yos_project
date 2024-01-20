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
@Table(name = "`Order`")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "voucher_id")
    private Voucher voucher;

    private String address;

    private String phone;

    private LocalDateTime createDate;

    private String description;

    private String status;

    private Long totalPrice;

    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "order")
    List<Rate> rates;


}
