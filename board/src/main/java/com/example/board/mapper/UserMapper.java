package com.example.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.dto.User;

@Mapper
public interface UserMapper {
	public User login(User user);
	public int signIn(User user);
}
