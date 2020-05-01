package com.brerp.biz.board.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.brerp.biz.board.BoardVO;

//@Repository("boardDAO")
public class BoardDAOSpring {// extends JdbcDaoSupport {

	//Spring Datasource 설정
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String BOARD_INSERT = "insert into test_board(seq, title, writer, wcontent, reg_dt, cnt)"
			+ " values ( ? , ?, ?, ?, NOW(), 0 ) ";
//			+ " select IFNULL(max(seq), 0)+1 , ?, ?, ?, NOW(), 0 from test_board ";
	private final String BOARD_UPDATE = "update test_board set title = ?,"
			+ "wcontent = ? where seq = ? ";
	private final String BOARD_DELETE = "delete from test_board where seq = ? ";
	private final String BOARD_GET = "select * from test_board where seq = ? ";
	private final String BOARD_LIST = "select * from test_board order by seq desc ";

	//@Autowired
	/* Datasource 설정
	 * public void setSuperDataSource(DataSource dataSource) {
	 * super.setDataSource(dataSource); }
	 */
	
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 insertBoard() 기능처리");
		//getJdbcTemplate().update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getWcontent());
		jdbcTemplate.update(BOARD_INSERT, vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getWcontent());
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 updateBoard() 기능처리");
		//getJdbcTemplate().update(BOARD_UPDATE, vo.getTitle(), vo.getWriter(), vo.getSeq());
		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getWriter(), vo.getSeq());
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 deleteBoard() 기능처리");
		//getJdbcTemplate().update(BOARD_DELETE, vo.getSeq());
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoard() 기능처리");
		Object[] args = {vo.getSeq()};
		//return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoardRowMapper());
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> JDBC로 getBoardList() 기능처리");
		//return getJdbcTemplate().query(BOARD_LIST, new BoardRowMapper());
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	}
}
