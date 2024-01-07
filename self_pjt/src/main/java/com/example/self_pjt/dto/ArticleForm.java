package com.example.self_pjt.dto;

import com.example.self_pjt.entity.Article;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id, title, content);
    }
}