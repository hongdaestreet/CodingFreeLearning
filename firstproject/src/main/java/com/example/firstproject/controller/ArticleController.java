package com.example.firstproject.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 1. 컨트롤러 선언
public class ArticleController {
    @GetMapping("/articles/new")  // 3. URL 요청 접수
    public String newArticleForm(Model model){  // 2. 메서드 생성 및 반환값 작성
        return "articles/new";  // 이 페이지와 연결시켜줌 ?
    }
}
