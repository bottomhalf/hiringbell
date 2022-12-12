package com.hiringbell.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.Board;
import com.hiringbell.repository.BoardRepository;

@Service
@Component
public class BoardService {
	
	@Autowired
	BoardRepository boardRepository;
	
	public ArrayList<Board> getAllBoardService() {
		var result = this.boardRepository.getAllBoardRepo();
		return (ArrayList<Board>) result;
	}

}
