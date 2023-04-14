package kr.ac.kopo.ui;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class AddUI extends BaseUI{

	private BoardDAO boardDao;
	
	public AddUI() {
		super();
		boardDao = new BoardDAO();
	}

	@Override
	public void execute() throws Exception {
		
		String title = scanStr("등록할 제목입력: ");
		String writer = scanStr("글쓴이 입력: ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		
		boardDao.insertBoard(board);
		
		System.out.println("새글 등록 완료...");
	}

}
