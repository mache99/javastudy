package com.example.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.board.dto.User;
import com.example.board.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	public static final String ERROR_MSG = "아이디혹은 비밀번호를 다시 한번 확인해주세요.";
	public static final String SUCCESS_MSG = "회원가입이 완료되었습니다.";
	
	@Autowired
	UserService service;
	
	@GetMapping("/login")
	public ModelAndView loginPage(ModelAndView mv) {
		
		mv.setViewName("login");
		return mv;
		
	}
	@PostMapping("/login")
	public ModelAndView dologin(ModelAndView mv, User user, HttpSession session) {
		
		boolean loginResult = service.login(user); //loginResult는 boolean true or false
		System.out.println(loginResult);
		if(loginResult) {
			session.setAttribute("user_id", user.getUser_id());
			mv.setViewName("index");   //true일경우는 index화면
			
		}else {
			mv.setViewName("login");   //false의 경우는 login화면
			mv.addObject("errorMsg", ERROR_MSG); //에러 메세지 
		}
		
		return mv;
		
	}
	
	@GetMapping("/signIn")
	public ModelAndView signInPage(ModelAndView mv) {
		mv.setViewName("signIn");
		return mv;
	}
	
	@PostMapping("/signIn")
	public ModelAndView doSignIn(ModelAndView mv, User user) {
		
		boolean signInResult = service.signIn(user);
		
		if(signInResult) {
			mv.addObject("successMsg", SUCCESS_MSG);
			mv.setViewName("login");
		
		} else {
			mv.setViewName("signIn");
		}
		
		return mv;
	}
}
