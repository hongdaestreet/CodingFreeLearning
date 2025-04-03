package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleForm {
    private String title;  // 제목을 받을 필드
    private String content;  // 내용을 받을 필드

    public ArticleForm(String content, String title) {
        this.content = content;
        this.title = title;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    
    // DTO인 form 객체를 엔티티 객체로 변환
    public Article toEntity() {
        return new Article(null,title,content); // 아직 id정보없음
    }
}
