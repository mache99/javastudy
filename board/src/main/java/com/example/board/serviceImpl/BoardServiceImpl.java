package com.example.board.serviceImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.board.dto.BoardDTO;
import com.example.board.entipy.Board;
import com.example.board.repository.BoardRepository;
import com.example.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardRepository repository;
	public boolean write(BoardDTO board, HttpSession session) {
		
		Board entipy = new Board();
		entipy.setTitle(board.getTitle());
		entipy.setContents(board.getContents());
		entipy.setUser((String)session.getAttribute("user_id"));
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
				
		entipy.setInsert_date(dtf.format(now));
		
		int writeResult = repository.write(entipy);
		
		
		if(writeResult > 0) {
			return true;
		}
		return false;
		
	}
	public ArrayList<Board> boardList(){
		
		ArrayList<Board> boardlist = repository.boardList();
		
		for(Board list : boardlist) {
			if(list.getTitle().length() > 10) {
				list.setTitle(list.getTitle().substring(0, 10).concat("..."));
			}
		}
		
		
		
		return boardlist;
	}
		
	
	
	
}
