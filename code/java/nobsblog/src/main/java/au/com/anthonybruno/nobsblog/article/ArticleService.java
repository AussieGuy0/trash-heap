package au.com.anthonybruno.nobsblog.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Optional<Article> getArticle(long id) {
        return articleRepository.findById(id);
    }

    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    public List<Article> getArticles() {
        List<Article> list = new ArrayList<>();
        articleRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
