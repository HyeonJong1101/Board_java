package kr.ac.kopo.ui;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class SearchOneUI extends BaseUI {

	private BoardDAO boardDao;
	
	public SearchOneUI() {
		super();
		boardDao = new BoardDAO();
	}

	@Override
	public void execute() throws Exception {
		
		int no = scanInt("조회할 글번호를 입력하세요 : ");

		BoardVO board = boardDao.searchByNo(no);
		
		System.out.println("-------------------------");
		System.out.println("번호 : " + no);
		System.out.println("제목 : "+ board.getTitle());
		System.out.println("작성자 : "+ board.getWriter());
		System.out.println("등록일 : "+ board.getRegDate());
		System.out.println("-------------------------");
	}

}
