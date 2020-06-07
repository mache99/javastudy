package com.example.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.board.entipy.Board;
import com.example.board.service.BoardService;

@Controller
public class MainController {
	public static final String EMPTY_DATA = "등록된 글이 없습니다.";
	
	@Autowired
	BoardService service;
	
	@GetMapping("/")
	public ModelAndView index(ModelAndView mv) {
		
		ArrayList<Board> list = service.boardList();
		
		if(list.isEmpty()) {
			
		}else {
			
			mv.addObject("boardList", list);
			
		}
		
		mv.setViewName("index");
		return mv;
		
	}
	
}
