package b354b.blog02.springbootdeveloper.repository;

import b354b.blog02.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
