package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor  // Article() 생성자 대체
@NoArgsConstructor
@ToString  // toString() 메서드 대체

@Entity  // 엔티티 선언 (Entity의 id,title,content 필드가 DB테이블의 각 열로 연결)
public class Article {
    @Id  // 엔티티 대푯값 지정
    @GeneratedValue  // 자동 생성 기능 추가(숫자가 자동으로 매겨짐)
    private Long id;
    
    @Column  // title 필드 선언 , DB 테이블의 title 열과 연결
    private String title;
    @Column  // content 필드 선언 , DB 테이블의 content 열과 연결
    private String content;
    
//    Article(){  // 기본 생성자 -> @NoArgsConstructor로 대체 가능
//    }
    
//    // 생성자 -> @AllArgsConstructor로 필요없어짐
//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }


//    @Override // -> @ToString로 대체
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
