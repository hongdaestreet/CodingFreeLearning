package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j  // 로깅 기능
@Controller // 1. 컨트롤러 선언
public class ArticleController {
    @Autowired  // SpringBoot가 미리 생성해 놓은 repository 객체 주입
    private ArticleRepository articleRepository;  // articleRepository 객체 선엉ㄴ

    @GetMapping("/articles/new")  // 3. URL 요청 접수
    public String newArticleForm() {  // 2. 메서드 생성 및 반환값 작성
        return "articles/new";  // 이 페이지와 연결시켜줌 ?
    }
    
    @PostMapping("/articles/create") // URL 요청 접수
    public String createArticle(ArticleForm form){  // form 데이터를  DTO에 담기
        log.info(form.toString());  // 로깅
//        System.out.println(form.toString());  //  -> @Slf4j로 대체
        // 1. DTO를 entity로 변환
        Article article = form.toEntity();
        log.info(article.toString());  // 로깅
//        System.out.println(article.toString()); // DTO가 엔티티로 잘 변환되는지 확인 출력 -> @Slf4j로 대체

        // 2. repository로 entity를 DB에 저장
        Article saved = articleRepository.save(article);  // article entity를 저장해 saved 객체에 반환함
        log.info(saved.toString());  // 로깅
//        System.out.println(saved.toString());  // article이 DB에 잘 저장되는지 확인 출력 -> @Slf4j로 대체
        return "";
    }
    
}
