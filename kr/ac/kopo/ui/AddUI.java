package kr.ac.kopo.ui;

import kr.ac.kopo.BoardServiceFactory;
import kr.ac.kopo.service.BoardService;
import kr.ac.kopo.vo.BoardVO;

public class AddUI extends BaseUI{

	private BoardService boardService;
	
	public AddUI() {
		super();
		boardService = BoardServiceFactory.getInstance();
	}

	@Override
	public void execute() throws Exception {
		
		String title = scanStr("등록할 제목입력: ");
		String writer = scanStr("글쓴이 입력: ");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setWriter(writer);
		
		boardService.insertBoard(board);
		
		System.out.println("새글 등록 완료...");
	}

}
