package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 선언
public class FirstController {
    
    @GetMapping("/hi") // 페이지 반환 (URL 연결) 요청 -> http://localhost:8080/hi로 접속하면 greetings.mustache 파일을 찾아 반환함
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "홍대거리");  // username에 "홍대" 삽입
        return "greetings";  // greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickName", "홍대거리");
        return "goodbye";
    }

}
