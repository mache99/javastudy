package com.example.board.repository;

import java.util.ArrayList;

import com.example.board.entipy.Board;

public interface BoardRepository {
	
	public int write(Board board);
	
	public ArrayList<Board> boardList();
	
}
