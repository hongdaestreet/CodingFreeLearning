package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title;  // 제목을 받을 필드
    private String content;  // 내용을 받을 필드

//    // @AllArgsConstructor를 선언함으로써 생성자 선언할 필요 없어짐
//    public ArticleForm(String content, String title) {
//        this.content = content;
//        this.title = title;
//    }

//    // @ToString 선언 -> toString() 대체
//    @Override
//    public String toString() {
//        return "ArticleForm{" +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }

    
    // DTO인 form 객체를 엔티티 객체로 변환
    public Article toEntity() {
        return new Article(null,title,content); // 아직 id정보없음
    }
}
