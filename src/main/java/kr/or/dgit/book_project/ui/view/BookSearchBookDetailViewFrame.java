package kr.or.dgit.book_project.ui.view;

import javax.swing.JPanel;

import kr.or.dgit.book_project.ui.common.InformDetailPanel;
import kr.or.dgit.book_project.ui.component.BookInfoBasic;

public class BookSearchBookDetailViewFrame extends JPanel {

	public BookSearchBookDetailViewFrame() {
		InformDetailPanel bookInformDetailPanel = new InformDetailPanel();
		bookInformDetailPanel.setOption("- 도서정보 -", "폐기");
		BookInfoBasic panel = new BookInfoBasic();
		bookInformDetailPanel.getpContent().add(panel);

	}
}
