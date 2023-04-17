package kr.ac.kopo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import kr.ac.kopo.BoardSequence;
import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {
	
	private BoardDAO boardDao;
	
	public BoardService() {
		boardDao = new BoardDAO();
	}
	
	public void insertBoard(BoardVO board) {
		
		//게시물 일련번호 저장
		board.setNo(BoardSequence.getBoardNO());
		
		//현재시간 저장
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		board.setRegDate(sdf.format(new Date()));
		
		boardDao.insertBoard(board);
	}
	
	public List<BoardVO> selectAll() {
		List<BoardVO> boardList = boardDao.selectAllBoard();
		return boardList;
	}
}
