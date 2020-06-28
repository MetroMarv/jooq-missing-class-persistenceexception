package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
    
    @Column(name="name")
    private String name;
}
