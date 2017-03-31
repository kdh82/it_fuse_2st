package kr.or.dgit.book_project.view_panel;

import kr.or.dgit.book_project.book_panel.BookInfoBasic;
import kr.or.dgit.book_project.book_panel.InformDetailPanel;


public class BookSearchBookDetailViewFrame extends InformDetailPanel {

	public BookSearchBookDetailViewFrame() {
		setOption("- 도서정보 -", "폐기");
		BookInfoBasic panel = new BookInfoBasic();
		pContent.add(panel);
		
	
		
	}
}
