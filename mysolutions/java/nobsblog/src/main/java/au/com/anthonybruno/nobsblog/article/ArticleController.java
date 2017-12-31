package au.com.anthonybruno.nobsblog.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController("/api/v1/article")
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public Article addArticle(Article article) {
       return articleService.addArticle(article);
    }

    @GetMapping("/{id}")
    public Article getArticle(@PathVariable("id") long id) {
        return articleService.getArticle(id).orElseThrow(EntityNotFoundException::new);
    }
}
