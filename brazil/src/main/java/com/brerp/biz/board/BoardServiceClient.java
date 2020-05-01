package com.brerp.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("com/config/applicationContext.xml");
		
		BoardService boardService = (BoardService) context.getBean("boardService");
		
		BoardVO vo = new BoardVO();
		vo.setSeq(100);
		vo.setTitle("Spring제목!");
		vo.setWriter("강감찬");
		vo.setWcontent("임시내용..Spring........");
		boardService.insertBoard(vo);
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		context.close();
	}

}
