package com.example.sbb10.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;
    public void create(String title , String content) {
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);

        this.articleRepository.save(article);
    }

    public List<Article> getList() {
        return this.articleRepository.findAll();
    }

    public Article getArticle(Integer id) {
        Optional <Article> article = this.articleRepository.findById(id);
        return article.get();
    }
}
