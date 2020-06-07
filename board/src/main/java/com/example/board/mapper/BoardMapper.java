package com.example.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.entipy.Board;

@Mapper
public interface BoardMapper {
	
	public int write(Board board);
	
	public ArrayList<Board> boardList();

}
