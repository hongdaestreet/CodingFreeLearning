package com.example.firstproject.dto;

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


}
