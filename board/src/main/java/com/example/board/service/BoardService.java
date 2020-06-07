package com.example.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.example.board.dto.BoardDTO;
import com.example.board.entipy.Board;

public interface BoardService {

	
	public boolean write(BoardDTO board, HttpSession session);
	
	public ArrayList<Board> boardList();
	
}
