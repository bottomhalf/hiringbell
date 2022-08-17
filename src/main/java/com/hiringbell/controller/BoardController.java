package com.hiringbell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiringbell.model.ResponseModal;
import com.hiringbell.service.BoardService;

@RestController
@RequestMapping("/Board")
public class BoardController extends BaseController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/getAllBoard")
	public ResponseModal getAllBoard() {
		var result = this.boardService.getAllBoardService();
		return BuildOk(result);
	}
	
}
