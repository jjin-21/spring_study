package com.example.self_pjt.comtroller;

import com.example.self_pjt.dto.ArticleForm;
import com.example.self_pjt.entity.Article;
import com.example.self_pjt.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class restController {
    @Autowired
    private ArticleRepository articleRepository;

    // GET
    @GetMapping("/articles")
    public List<Article> index() {
        return articleRepository.findAll();
    }
    @GetMapping("/articles/{id}")
    public Article show(@PathVariable Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    // POST
    @PostMapping("/articles")
    public Article create(@RequestBody ArticleForm dto) {
        Article article = dto.toEntity();
        return articleRepository.save(article);
    }
}