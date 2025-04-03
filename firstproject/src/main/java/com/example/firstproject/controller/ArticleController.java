package com.example.firstproject.controller;

import ch.qos.logback.core.model.Model;
import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // 1. 컨트롤러 선언
public class ArticleController {
    @GetMapping("/articles/new")  // 3. URL 요청 접수
    public String newArticleForm() {  // 2. 메서드 생성 및 반환값 작성
        return "articles/new";  // 이 페이지와 연결시켜줌 ?
    }
    
    @PostMapping("/articles/create") // URL 요청 접수
    public String createArticle(ArticleForm form){  // form 데이터를  DTO에 담기
        System.out.println(form.toString());
        // 1. DTO를 entity로 변환
        Article article = form.toEntity();
        // 2. repository로 entity를 DB에 저장

        return "";
    }
    
}
