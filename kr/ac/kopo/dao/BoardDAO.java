package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class BoardDAO{

	private List<BoardVO> boardList;
	
	public BoardDAO() {
		boardList = new ArrayList<>();
	}
	
	public void insertBoard(BoardVO board) {
		boardList.add(board);
	}
	
	public BoardVO searchByNo(int no) {
		
		for(BoardVO board : boardList) {
			if(board.getNo() == no)
				return board;
		}
		return null;
		
	}
	
	public List<BoardVO> selectAllBoard(){
		return boardList;
	}
	
}
