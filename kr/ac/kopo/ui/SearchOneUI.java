package kr.ac.kopo.ui;

public class SearchOneUI extends BaseUI {

	public SearchOneUI() {
		super();
	}

	@Override
	public void execute() throws Exception {
		
		int no = scanInt("조회할 글번호를 입력하세요 : ");
		
		System.out.println("-------------------------");
		System.out.println("번호 : " + no);
		System.out.println("제목 : ");
		System.out.println("작성자 : ");
		System.out.println("등록일 : ");
		System.out.println("-------------------------");
	}

}
