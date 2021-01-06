package com.example.springbootcrud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NEWS_TBL")
public class News {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private int quantity;
    private Date created_date;
}
