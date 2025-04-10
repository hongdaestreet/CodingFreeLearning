package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// CrudRepository : 엔티티 CRUD (from JPA)
public interface ArticleRepository extends CrudRepository<Article, Long> {  // <Article:관리 대상 엔티티의 클래스 type,Long:관리 대상 엔티티의 대폿값 type>



}
