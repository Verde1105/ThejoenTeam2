package com.thejoeun.team2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "news_articles")
public class NewsArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 100)
    private String title;
    
    @Column(length = 200)
    private String originallink;
    
    @Column(length = 200)
    private String description;

    // constructors, getters, and setters
    
    public NewsArticle() {
    }
        
}
