
package com.brerp.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.brerp.biz.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends SqlSessionDaoSupport {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoard() 기능처리");
		getSqlSession().insert("BoardDAO.insertBoard", vo);
//		mybatis.commit();
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoard() 기능처리");
		getSqlSession().update("BoardDAO.updateBoard", vo);
//		mybatis.commit();
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoard() 기능처리");
		getSqlSession().delete("BoardDAO.deleteBoard", vo);
//		mybatis.commit();
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> JDBC로 getBoard() 기능처리");
		return (BoardVO) getSqlSession().selectOne("BoardDAO.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> JDBC로 getBoardList() 기능처리");
		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
	}
}
