package com.brerp.view.board;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.brerp.biz.board.BoardService;
import com.brerp.biz.board.BoardVO;
import com.brerp.biz.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/dataTransform.do")
	@ResponseBody
	public List<BoardVO> dataTransform(BoardVO vo) {
		List<BoardVO> boardList = boardService.getBoardList(vo);
		return boardList;
	}
	
	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException {
		//파일 업로드 처리
		MultipartFile uploadFile = vo.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("D:/sample/" + fileName));
		}
		
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}

	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}

	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}

	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, ModelAndView mav) {
		mav.addObject("board", boardService.getBoard(vo)); // Model 정보 저장
		mav.setViewName("getBoard.jsp"); // View 정보 저장
		return mav;
	}

	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, ModelAndView mav) {
		mav.addObject("boardList", boardService.getBoardList(vo)); // Model 정보 저장
		mav.setViewName("getBoardList.jsp"); // View 정보 저장
		return mav;
	}
}