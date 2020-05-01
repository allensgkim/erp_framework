package com.brerp.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.brerp.biz.board.BoardVO;

public class BoardRowMapper implements RowMapper<BoardVO> {

	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board = new BoardVO();
		board.setSeq(rs.getInt("SEQ"));
		board.setTitle(rs.getString("TITLE"));
		board.setWriter(rs.getString("WRITER"));
		board.setWcontent(rs.getString("WCONTENT"));
		board.setReg_dt(rs.getDate("REG_DT"));
		board.setCnt(rs.getInt("CNT"));
		return board;
	}
}
