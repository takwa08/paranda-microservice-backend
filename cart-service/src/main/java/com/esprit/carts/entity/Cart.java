package com.esprit.carts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "carts")
public class Cart {
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private Long id;
                private Long productId;
                private int quantity;
                // other fields, constructors, getters, and setters
        }


