package kr.or.dgit.book_project.ui.view;

import kr.or.dgit.book_project.ui.common.InformDetailPanel;
import kr.or.dgit.book_project.ui.component.BookInfoBasic;


public class BookSearchBookDetailViewFrame extends InformDetailPanel {

	public BookSearchBookDetailViewFrame() {
		setOption("- 도서정보 -", "폐기");
		BookInfoBasic panel = new BookInfoBasic();
		pContent.add(panel);
		
	
		
	}
}
