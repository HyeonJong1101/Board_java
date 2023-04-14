package kr.ac.kopo.ui;

public class ExitUI extends BaseUI{

	public ExitUI() {
		super();
	}

	@Override
	public void execute() throws Exception {
		System.out.println("-------------------------");
		System.out.println("\t게시판 프로그램 종료");
		System.out.println("-------------------------");
		System.exit(0);
	}
	
}
